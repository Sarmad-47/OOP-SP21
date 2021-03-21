package labac1;

public class ObjectPassTest {

    public static void main(String[] args) {
        ObjectPass p = new ObjectPass();
        p.value = 5;
        System.out.println("Before calling: " + p.value);
        p.increment(p);
        System.out.println("After calling: " + p.value);
    }

}


