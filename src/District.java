import java.util.ArrayList;
import java.util.List;
import  java.lang.Double;
/**
 *
 * This is an abstract representation of a District with composition of Incidents
 * stored in an arraylist. Constructor defines the new arraylist and a name for the
 * district.
 *
 * @author Raminta Misiunaite
 *
 */
public class District {

     private String districtName;
     List<Incident> incidentList;

    public District(String districtName) {
        this.districtName = districtName;
        incidentList = new ArrayList<>();

    }

    public District(String districtName, ArrayList<Incident> incidentList) {
        this.districtName = districtName;
        this.incidentList = incidentList;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }


    @Override
    public String toString() {
        return "District{" +
                "districtName='" + this.getDistrictName() + '\'' +
                ", incidentList=" + incidentList +
                '}';
    }

    public void addIncidentToAList(Incident temp){
        incidentList.add(temp);
    }


    /**
     * This method finds the Incident with a highest value in the district.
     * @return the Incident with a highest value.
     */
    public Incident highestValueIncident(){
        double max = 0;
        int index = 0;
        for ( Incident i: incidentList) {
            if (i.getValue() > max) {
                max = i.getValue();
                index = incidentList.indexOf(i);
            }
        }
        return incidentList.get(index);
    }

    /**
     * This method finds the average incident value recorded in the district
     * in a given year.
     * @param year is the year a user inputs.
     * @return the average double value; If average is not a number (does not exist) returns 0
     */
    public double averageIncidentValue(int year ){
        double average;
        double sum = 0;
        int amount = 0;
        for ( Incident i: incidentList) {
            if (i.getYear() == year) {
                sum = sum + i.getValue();
                amount++;
            }
        }
        average = sum/amount;
        if (Double.isNaN(average)){
            return 0;
        }else {
            return average;
        }
    }

    /**
     * This method creates a list of all incidents recorded in the district with a value
     * greater than a given amount of money.
     * @param value is double value user inputs that incidents have tobe greater than.
     * @return an arraylist of incidents which meet the condition
     */
    public List<Incident> incidentsWithGreaterValue(double value){
        List<Incident> temp = new ArrayList<>();
        for ( Incident i: incidentList) {
            if (i.getValue() > value) {
                temp.add(i);
            }
        }
        return temp;
    }
}
