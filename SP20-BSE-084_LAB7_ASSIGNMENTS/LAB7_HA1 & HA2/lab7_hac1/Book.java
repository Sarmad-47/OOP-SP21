
package lab7_hac1;

public class Book {
private Person author;
private String bookname;
private String publisher;

Book(Person author,String bookname,String publisher){
    this.author=author;
    this.bookname=bookname;
    this.publisher=publisher;
    
      }

@Override
   public String toString(){
       return String.format("Author = {%s} \nBook Name = [%s]  \nPublisher of the book = [%s]   ",author,bookname,publisher);
   }
}
