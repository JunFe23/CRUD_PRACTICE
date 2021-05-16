package sist.com.basic1.di;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="abc")
public class Store {
	/*@Autowired*/
	@Inject
	@Qualifier(value="qb2")
	private Book book;
	@Inject
	@Qualifier(value="qb1")
	private Book book2;

	public Book getBook() {
		return book;
	}
	@Inject	
	public void setBook(@Qualifier(value="qb1") Book book,@Qualifier(value="qb2")Book book2) {
		this.book = book;
		this.book2=book2;
	}
	@Override
	public String toString() {
		return "Store [book=" + book + ", book2=" + book2 + "]";
	}

	
	
	

}
