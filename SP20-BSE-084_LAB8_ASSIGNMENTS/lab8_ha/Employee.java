
package lab8_ha;

public class Employee extends Person {
    private String office;
    private double salary;
   private DateHired datehired;
   
    public Employee(String name, String address, String phonenumber, String email,String office,double salary) {
        super(name, address, phonenumber, email);
        this.office=office;
        this.salary=salary;
        this.datehired = new DateHired();
    }
   
    @Override
    public String toString(){
        return super.toString()+"\nOffice = "+office +"\nsalary = "+salary+"\nDate Hired = "+datehired.toString();
    }
    
}
