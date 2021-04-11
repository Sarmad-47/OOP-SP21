
package lab7_hac1;


public class PersonRunner {
     public static void main(String[] args) {
         /**
          * person 1 address
          */
       Address address1= new Address(77,854,"Islamabad",44410);
       address1.setStreetno(51);
       address1.setHouseno(208);
       address1.setCity("Faisalabad");
       address1.setPostal_Code(87951);
         System.out.println("Street No: "  +address1.getStreetno() );
         System.out.println("House no: "+ address1.getHouseno() ); 
         System.out.println("City: "+ address1.getCity());
         System.out.println("Postal Code: "+address1.getPostal_Code() );
      
       Person person1=new Person("Ali",address1,"0321440021");
         System.out.println(address1.toString());
          System.out.println(person1.toString());
          
          
        
         /**
          * person 2 address
          */
         Address address2= new Address(12,210,"Islamabad",44480);
          Person person2=new Person("Rashid",address2,"0320550047");
          System.out.println(person2);
          
          
          
          /**
           * publisher and book name. 
           */
         Book book1=new Book(person1,"Broken Glass","Alain Mabanckou");
         System.out.println(book1.toString());
         
         
         Book book2=new Book(person2,"Harvest","Jim Crace");
         System.out.println(book2);
    }
    
}
