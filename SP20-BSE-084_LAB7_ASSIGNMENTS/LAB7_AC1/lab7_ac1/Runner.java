package lab7_ac1;

public class Runner {

    public static void main(String[] args) {
        StudentRecord s= new StudentRecord("MBA");
        EmployeeRecord e = new EmployeeRecord(111,50000);
        Manager m1=new Manager("finance Manager",5000,e,s);
        m1.display();
    }

}
