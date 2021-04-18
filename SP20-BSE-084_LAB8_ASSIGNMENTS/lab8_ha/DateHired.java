package lab8_ha;

public class DateHired {

    private int month;
    private int day;
    private int year;

    public DateHired() {
        this.day = 1;
        this.month = 2;
        this.year = 2020;
    }

    public DateHired(int month, int day, int year) {
        if (day > 0 && day <= 31) {
            this.day = day;
        } else {
            day = 1;
        }
        if (month > 0 && month <= 12) {
            this.month = month;
        } else {
            month = 1;
        }
        this.year = year;
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
