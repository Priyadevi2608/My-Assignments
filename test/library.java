package test;

public class library {
 String	addBook(String bookTitle) {
	 System.out.println("Book added successfully");
	return(bookTitle);
 }
 public void issueBook()
 {
	 System.out.println("Book issued successfully");
 }
	
	
 

	public static void main(String[] args) {
		library lb=new library();
		lb.addBook("String bookTitle");
		lb.issueBook();

	}

}
