
package lab7_hac1;

public class Person {
    private Address address;
    private String name; 
    private String contactno;
    
    Person(String name, Address address,String contactno){
        this.name=name;
        this.address=address;
        this.contactno=contactno;
        
    }
    
    @Override
    public String toString(){
       return String.format("Name = [%s] , Address = {%s} , Contact no = [%s]   ",name,address,contactno);
    }
}
