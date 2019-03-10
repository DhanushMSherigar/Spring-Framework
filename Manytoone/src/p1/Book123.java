package p1;

public class Book123 
{
private int bookid;
private String bookname;
private Publisher123 publisher;
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public void setPublisher(Publisher123 publisher) {
	this.publisher = publisher;
}

public int getBookid() {
	return bookid;
}
public String getBookname() {
	return bookname;
}
public Publisher123 getPublisher() {
	return publisher;
}

}
