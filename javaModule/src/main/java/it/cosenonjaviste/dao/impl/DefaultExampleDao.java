package it.cosenonjaviste.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.cosenonjaviste.ConnectionManager;
import it.cosenonjaviste.dao.ExampleDao;
import it.cosenonjaviste.model.ExampleModel;

public class DefaultExampleDao implements ExampleDao{

	public void insert(ExampleModel example) {
		// TODO Auto-generated method stub
		Connection conn;
		String query = "INSERT IGNORE INTO example values(" + example.getId() +  ")";
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			// insert the data
			statement.executeUpdate(query);
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public ExampleModel selectExampleById(int id) {
		// TODO Auto-generated method stub
		ExampleModel exampleModel = null;
		Connection conn;
		String query = "Select * from Example where id=" + id;
		try {
			conn = ConnectionManager.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			if (rs.next()) {
				// Retrieve by column name
				int idRes=rs.getInt("id");
				
				exampleModel = new ExampleModel(idRes);
			}

			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return exampleModel;
	}
	

	

}
