package assingment;

import java.util.Scanner;

public class Books {
	public Books(int bookNo, String title, String author, float price) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	int size = 3;
	Scanner scanner = new Scanner(System.in);
     int bookNo ;
     String title ;
     String author;
     float price;
     Books[] books = new Books[size];
     System.out.println("Set all the values of books here");
     char[][] book;
	for(int i=0;i<size;i++) {
    	 bookNo=i+1;
    	 scanner.nextLine();
    	 System.out.println("Enter book title");
    	 title = scanner.nextLine();
    	 int titleLength = title.length();
    	 while(titleLength<4) {
    	System.out.println("Enter Valid title");
    	title = "";
    	author = scanner.nextLine();
    	titleLength = title.length();
    	 }
    	System.out.println("Enter book author");
    	author = scanner.nextLine();
    	System.out.println("Enter book price");
    	price = scanner.nextFloat();
    	while(price<1||price>5000) {
    		System.out.println("Enter valid price");
    		price = scanner.nextFloat();
    	}
		book[i] = new Books(bookNo,title,author,price);
    	 }
     System.out.println("Enter the Book Number to see details(1-3)&to exits press zero(0) ");
     int choice = 0;
     do {
    	 choice = scanner.nextInt();
    	 switch(choice) {
    	 case 1:
    		 System.out.println(book[choice-1]);
    		 break;
    	 case 2:
    		 System.out.println(book[choice-1]);
    		 break;
    	 case 3:
    		 System.out.println(book[choice-1]);
    		 break;
    		 defult:
    		 System.out.println("Enter invalid choice!");
    		 System.out.println();   
    		 }
     }while(choice!=0);
}
	}



