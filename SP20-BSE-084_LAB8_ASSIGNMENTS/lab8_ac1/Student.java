package lab8_ac1;

public class Student extends Person {

    private String rollNo;
    private int marks;

    public Student() {
        super();
        rollNo = "sp14bcs039";
        marks = 345;
    }

    public Student(String a, String b, int c, String d, int e) {
        super(a, b, c);
        rollNo = d;
        marks = e;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll # : " + rollNo + "\nMarks : " + marks);
    }

}
