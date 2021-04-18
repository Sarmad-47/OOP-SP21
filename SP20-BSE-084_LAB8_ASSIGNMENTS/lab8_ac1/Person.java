package lab8_ac1;

public class Person {

    private String name;
    private String id;
    private int phone;

    public Person() {
        name = "NaginaNazar";
        id = "sp14bcs039";
        phone = 12345;
    }

    public Person(String a, String b, int c) {
        name = a;
        id = b;
        phone = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void display() {
        System.out.println("Name : " + name + " ID : " + id + "Phone : " + phone);
    }

}
