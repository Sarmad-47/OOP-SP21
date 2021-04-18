package lab8_assignment1;

import java.util.Scanner;

public class PublishingRunner {

    public static void main(String[] args) {
        
          Scanner kb = new Scanner(System.in);
                Book book = new Book();
                Tape tape = new Tape();

                System.out.print("Enter book title =  ");
                book.setTitle(kb.nextLine());
                System.out.print("Price of the book = $");
                book.setPrice(kb.nextDouble());
                kb.nextLine();
                System.out.print("Total pages =  ");
                book.setPages(kb.nextInt());
                kb.nextLine();

                System.out.print("\nEnter tape title: ");
                tape.setTitle(kb.nextLine());
                System.out.print("Price of the tape = $");
                tape.setPrice(kb.nextDouble());
                kb.nextLine();
                System.out.print("Tape time =  ");
                tape.setTime(kb.nextInt());

                System.out.println("\nBook Details:-");
                book.Display();
                System.out.println("\nTape Details:-");
                tape.Display();

    }

}
