package labactivites;

public class Distance {

    private int feet;
    private int inches;

    public Distance() {
        feet = 8;
        inches = 4;
    }

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void setInches(int inches) {
        this.inches = inches;

    }

    public void setFeet(int feet) {
        this.feet = feet;

    }

    public int getInches() {
        return inches;
    }

    public int getFeet() {
        return feet;
    }
    public  Distance Add(Distance d) {
        Distance d_new = new Distance(feet + d.feet, inches + d.inches);
        return d_new;
    }

    public String toString() {
        return String.format("feet = %d , inches = %d ", feet, inches);
    }
}
