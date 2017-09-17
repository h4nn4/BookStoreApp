//NUR FARHANA BT FARISHAMUDIN
//240912
//LAB TEST

import java.util.Scanner;

public class BookStoreApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book[] book = new Book[5];

        String author, title;
        double price, max = 0, min = 0, average;
        int countJava = 0;
        int i = 0;
        do {
            //for(i=0;i>book.length;i++){
            System.out.print("Enter the author name >");
            author = input.next();//author=input.nextLine();
            System.out.print("Enter book title >");
            title = input.next();
            System.out.print("Enter book price >");
            price = input.nextDouble();
            System.out.println("");

            average = price + price / 2;
            if (price > max) {
                max = price;
            } else {
                min = price;
            }

            if (title.equals("Java") || title.equals("java")) {
                countJava++;
            }
            ++i;
        } while (i < book.length);

        System.out.println("Displaying all books:");
        Book b = new Book(author, title, price);
        //for (Book b1 : book) {
        for (i = 0; i < book.length; i++) {
            System.out.println("-------------Book " + (i + 1) + "---------------");
            System.out.println("Author = " + b.getAuthor());
            System.out.println("Title = " + b.getTitle());
            System.out.println("Price = " + b.getPrice());
        }
        System.out.println("************************************");
        System.out.println("Average price of books =" + average);
        System.out.println("Highest Price = " + max);
        System.out.println("Lowest Price = " + min);
        System.out.println("Number of books entitled Java = " + countJava);
    }
}
