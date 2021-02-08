
public class Incident {

    private double value;
    private String postcode;
    private int month;
    private int year;


    public Incident(double value, String postcode, int month, int year) {
        this.value = value;
        this.postcode = postcode;
        this.month = month;
        this.year = year;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Incident{" +
                "value=" + this.getValue() +
                ", postcode='" + this.getPostcode() + '\'' +
                ", month=" + this.getMonth() +
                ", year=" + this.getYear() +
                '}';
    }

}
