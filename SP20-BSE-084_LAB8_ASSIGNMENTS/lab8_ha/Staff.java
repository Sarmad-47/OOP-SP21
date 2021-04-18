
package lab8_ha;


public class Staff extends Employee{
    private String title;

    public Staff(String name, String address, String phonenumber, String email, String office, double salary,String title) {
        super(name, address, phonenumber, email, office, salary);
        this.title=title;
    }
    @Override
    public String toString(){
        return super.toString() + "\nTitle = "+title;
    }
}
