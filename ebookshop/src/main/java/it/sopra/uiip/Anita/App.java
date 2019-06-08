package it.sopra.uiip.Anita;

import java.util.ArrayList;

import it.sopra.uiip.Anita.dao.BookDao;
import it.sopra.uiip.Anita.dao.impl.DefaultBookDao;
import it.sopra.uiip.Anita.model.BookModel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

		BookDao bookDao = new DefaultBookDao();
	    
	    //insert
	    BookModel book = new BookModel(1007, "first example maven project", "anita verrilli", (float) 66.6, 66);
    	bookDao.insertBook(book);
		
		//select by id
		BookModel bookModel = bookDao.selectBookById(1006);
		System.out.println(bookModel.toString());
   
		//update quantity
		bookDao.updateQtyById(1007, 77);
		
		//select all books
		ArrayList<BookModel> books = bookDao.selectAllbooks();
		for(BookModel bookModel2: books) {
			System.out.println(bookModel2.toString());
		}
        
    }
}
