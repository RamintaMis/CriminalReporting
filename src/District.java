import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class District {

     private String districtName;
     ArrayList<Incident> incidentList = new ArrayList<>();

    public District(String districtName) {
        this.districtName = districtName;
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
    public void getIncidentList(){
        for ( Incident i: incidentList) {
            System.out.println(i);
        }
    }

    //The incident with the highest value recorded in the district.
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

    //The average incident value recorded in the district in a given year
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
        return average;
    }
    //A list of all incidents recorded in the district with a value greater than a given amount
    //of money.
    public ArrayList<Incident> incidentsWithGreaterValue(double value){
        ArrayList<Incident> temp = new ArrayList<>();
        for ( Incident i: incidentList) {
            if (i.getValue() > value) {
                temp.add(i);
            }
        }
        return temp;
    }


}
