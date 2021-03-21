package labha2;

import java.util.Arrays;

public class BookTest {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAuthor("Paul");
        String[] chaps = {"short rest", "Pilot"};
        book1.setChapter(chaps);
        System.out.println(book1.getAuthor());
        System.out.println(Arrays.toString(book1.getChapter()));

        Book book2 = new Book();
        book2.setAuthor("JackSon");
        String chapter2[] = {"Anne's History", "Super Slush", "dream"};
        book2.setChapter(chapter2);
        System.out.println(book2.getAuthor());
        System.out.println(Arrays.toString(book2.getChapter()));

        System.out.println(Book.compareBook(book1, book2));
        System.out.println("The author which has greater number of books is: " + Book.compareChapter(book1, book2));

    }

}
