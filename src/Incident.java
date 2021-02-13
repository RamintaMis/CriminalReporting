
/**
 *
 * This is an abstract representation of an Incident. Constructor defines the value,
 * postcode, month and year of given incident.
 * district.
 *
 * @author Raminta Misiunaite
 *
 */

public class Incident {

    private double value;
    private String postcode;
    private String month;
    private int year;


    public Incident(double value, String postcode, String month, int year) {
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

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
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
