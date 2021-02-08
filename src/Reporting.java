import java.util.ArrayList;

public class Reporting {

    ArrayList<District> districtList = new ArrayList<>();
    ArrayList<Incident> allIncidents = new ArrayList<>();

    public void addDistrict(District temp){
        districtList.add(temp);
    }
    public void printDistrictList(){
        for(District d : districtList){
            System.out.println(d);
        }
    }

    //The district with the largest average value incident for a given year
    public District largestAvgValue(int year){
        double max = 0;
        int index = 0;
        for(District d : districtList){
            if(d.averageIncidentValue(year) > max){
                max = d.averageIncidentValue(year);
                index = districtList.indexOf(d);
            }
        }
        return districtList.get(index);
    }

    public ArrayList<Incident> putAllIncidentsToList(){
        for (District d: districtList){
            for (Incident i: d.incidentList){
                allIncidents.add(i);
            }
        }
        return allIncidents;
    }
    //The largest value incident ever recorded.
    public Incident largestValueIncident(){
        double max = 0;
        int index = 0;
        putAllIncidentsToList();
        for (Incident i : allIncidents){
            if(i.getValue()>max){
                max = i.getValue();
                index = allIncidents.indexOf(i);
            }
        }
        return allIncidents.get(index);
    }
    // A list of all incidents recorded with value greater than a given amount ofmoney.
    public ArrayList<Incident> incidentsGreaterThanValue(double value){
        putAllIncidentsToList();
        ArrayList<Incident> temp = new ArrayList<>();
        for ( Incident i: allIncidents) {
            if (i.getValue() > value) {
                temp.add(i);
            }
        }
        return temp;
    }



}
