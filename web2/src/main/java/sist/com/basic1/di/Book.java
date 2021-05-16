package sist.com.basic1.di;
public class Book {
	
	private String bookName;
	private int price;
	private String publisher;
	private String author;
	
	
	
	public void initBook() {
		System.out.println("initBook");
	}
	
	public void destoryBook() {
		System.out.println("destoryBook");
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", price=" + price + ", publisher=" + publisher + ", author=" + author
				+ "]";
	}
	
	
	

}
