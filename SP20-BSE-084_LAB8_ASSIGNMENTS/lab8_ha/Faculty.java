
package lab8_ha;


public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phonenumber, String email, String office, double salary,String hours,String rank) {
        super(name, address, phonenumber, email, office, salary);
        officeHours=hours;
        this.rank=rank;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nOfficehours = "+officeHours+"\nRank = "+rank;
    }
    

}
