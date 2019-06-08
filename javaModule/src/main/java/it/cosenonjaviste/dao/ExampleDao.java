package it.cosenonjaviste.dao;

import it.cosenonjaviste.model.ExampleModel;

public interface ExampleDao {
	
	public void insert(ExampleModel example);

	public ExampleModel selectExampleById(int id);


}
