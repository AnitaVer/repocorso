package it.sopra.uiip.Anita.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.sopra.uiip.Anita.ConnectionManager;
import it.sopra.uiip.Anita.dao.BookDao;
import it.sopra.uiip.Anita.model.BookModel;

public class DefaultBookDao implements BookDao{
	
	public void insertBook(BookModel book) {
		
		Connection conn;
		String query = "INSERT IGNORE INTO book values(" + book.getId() + ", '" + book.getTitle() + "', '" + book.getAuthor() + "', " + book.getprice() + ", " + book.getQty() + ")";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			st.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public BookModel selectBookById(int id) {
		// TODO Auto-generated method stub
		BookModel bookModel = null;
		Connection conn;
		String query = "select * from book where id = " + id;
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				bookModel = new BookModel(rs.getInt("id"), rs.getString("title"), rs.getString("author"), rs.getFloat("price"), rs.getInt("qty"));
			}
			
			conn.close();
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return bookModel;
	}

	public void updateQtyById(int id, int qty) {
		// TODO Auto-generated method stub
		Connection conn;
		String query = "UPDATE book SET qty = " + qty + " where id = " + id;
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			st.executeUpdate(query);
			conn.close();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	public ArrayList<BookModel> selectAllbooks() {
		// TODO Auto-generated method stub
		ArrayList<BookModel> books = new ArrayList<BookModel>();
		BookModel book = null;
		Connection conn;
		String query = "select * from book";
		
		try {
			conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				book = new BookModel(rs.getInt("id"), rs.getString("title"), rs.getString("author"), rs.getFloat("price"), rs.getInt("qty"));
				books.add(book);
			}
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return books;
	}
	
	
	
	
	
	

}
