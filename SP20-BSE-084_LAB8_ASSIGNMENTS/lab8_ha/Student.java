
package lab8_ha;


public class Student extends Person{
    
 private String status;

    public Student(String name, String address, String phonenumber, String email,String status) {
        super(name, address, phonenumber, email);
        this.status=status;
    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
 @Override
    public String toString(){
        return super.toString() + "\nStatus of the student = " + status;
    }
    
}
