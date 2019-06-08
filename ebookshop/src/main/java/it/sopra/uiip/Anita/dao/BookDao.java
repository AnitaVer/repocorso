package it.sopra.uiip.Anita.dao;

import java.util.ArrayList;

import it.sopra.uiip.Anita.model.BookModel;

public interface BookDao {
	
	public void insertBook(BookModel book);
	public BookModel selectBookById(int id);
	public void updateQtyById(int id, int qty);
	public ArrayList<BookModel> selectAllbooks();

}
