
package lab8_ha;

public class Person {
  private String  name; 
   private String address; 
   private String phonenumber; 
   private String email;
   
  public Person(String name, String address,String phonenumber,String email){
       this.name=name;
       this.address=address;
       this.phonenumber=phonenumber;
       this.email=email;
       
   }
   
  @Override
   public String toString(){
       return String.format("Name = %s \nAddress = %s \nPhone Number = %s \nEmail = %s ",name,address,phonenumber,email);
   }
}
