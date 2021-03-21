package labha2;

import java.util.Arrays;

public class Book {

    private String author;

    private String[] chapterNames = new String[100];

    Book() {
        author = author;
        chapterNames = chapterNames;

    }

    Book(String Author, String chapter[]) {
        this.author = Author;
        this.chapterNames = chapter;

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setChapter(String chapter[]) {
        this.chapterNames = chapter;
    }

    public String getAuthor() {
        return author;
    }

    public String[] getChapter() {
        return chapterNames;
    }

    public static boolean compareBook(Book book1, Book book2) {
        if (book1.getAuthor().equals(book2.getAuthor())) {
            return true;
        } else {
            return false;
        }

    }

   public static String compareChapter(Book book1, Book book2) {
        if (book1.getChapter().length > book2.getChapter().length) {
            return book1.getAuthor();
        } else {
            return book2.getAuthor();
        }
    }

    public void Display() {
        System.out.println("Author = " + author + "\t" + "ChapterName= " + Arrays.toString(chapterNames));
    }
}
