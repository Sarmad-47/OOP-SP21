package lab8_ha;

public class HARUNNER {

    public static void main(String[] args) {
        Person person = new Person("Peter Parker ", "74 Park Avenue London SE56 2YE", "123-458-5689", "petteparky@gmail.com");
        System.out.println("Person " + person.toString());
        System.out.println("\n");

        Employee employee = new Employee("Hugh Jackman", "70 Broadway. London. SE34 2UZ", "123-258-6589", "jackky54@hotmail.com", "IBM", 7000);
        System.out.println("Employee " + employee.toString());
        System.out.println("\n");

        Student student = new Student("Eva Marie", "East 14th Street, New York, NY 10003, United States", "123-232-2322", "evamarie99@yahoo.com", "Freshman");
        System.out.println("Student " + student.toString());
        System.out.println("\n");
        
        DateHired date=new DateHired(4,5,2019);
       Faculty faculty = new Faculty("John Cena", "20 Cooper Square, New York, NY 10003, USA", "111-233-2311", "John_cena47@gmail.com", "PepsiCo", 10000,"8:00 A.M to 6:00 P.M","Senior Manager");
        System.out.println("Faculty "+faculty);
        System.out.println("\n");
        
        
        Staff staff=new Staff("Michael De Santa", "Grove Street, Los Santos", "323-555-010", "desanta@yahoo.com", "Merryweather Security", 2000,"Vice President");
        System.out.println("Staff "+staff.toString());
    }

}
