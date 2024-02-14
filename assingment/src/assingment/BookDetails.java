package assingment;

import java.util.Scanner;

public class BookDetails {
			public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			//System.out.println("Enter book number");
			//int bookNo = scanner.nextInt() ;
			//System.out.println("Enter book Title");
			//String title = scanner.next();
			//System.out.println("Enter book author");
			//String author = scanner.next();
			//System.out.println("Enter book price");
			//float price =scanner.nextFloat();
			//Book book = new Book(bookNo,title,author,price);
			//System.out.println(book);
			Book[] books = new Book[3];//2
			for(int i=0;i<books.length;i++) {
				System.out.println("enter book:"+(i+1));
				System.out.println("Enter book number");
				int bookNo = scanner.nextInt() ;
				
				System.out.println("Enter book Title");
				String title = scanner.next();
				
				System.out.println("Enter book author");
				String author = scanner.next();
				
				System.out.println("Enter book price");
				float price =scanner.nextFloat();
				
				books[i] = new Book(bookNo,title,author,price);
				
			}
			for(Book book :books)
				System.out.println(book);
}
}