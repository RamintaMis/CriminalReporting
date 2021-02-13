import java.util.ArrayList;

/**
 * This is class stores arraylists of all Districts and all Incidents.
 * Mainly is used for storing methods that are used in ReportingIO class.
 */
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

    /**
     * This method finds the district with the largest average value incident for a given year
     * @param year user's given year
     * @return the chosen District; if none of the districts have incidents in the given year,
     * outputs a message and returns null.
     */
    public District largestAvgValue(int year){
        double max = 0;
        int index = 0;
        for(District a : districtList){
            if (a.averageIncidentValue(year) > max) {
                max = a.averageIncidentValue(year);
                index = districtList.indexOf(a);
            }
        }
        if(max != 0){
            return districtList.get(index);
        }else{
            System.out.println("No incidents that year");
            return null;
        }
    }

    public ArrayList<Incident> putAllIncidentsToList(){
        for (District d: districtList){
            for (Incident i: d.incidentList){
                allIncidents.add(i);
            }
        }
        return allIncidents;
    }
    public void printAllIncidents(){
        for(Incident i : allIncidents){
            System.out.println(i);
        }
    }

    /**
     * This method finds the Incident with the largest value ever recorded.
     * @return the Incident
     */
    public Incident largestValueIncident(){
        double max = 0;
        int index = 0;
        for (Incident i : allIncidents){
            if(i.getValue()>max){
                max = i.getValue();
                index = allIncidents.indexOf(i);
            }
        }
        return allIncidents.get(index);
    }
    // A list of all incidents recorded with value greater than a given amount of money.

    /**
     * This method creates an arraylist of all incidents recorded with value greater
     * than a given amount of money.
     * @param value user's input of double value that incidents have to be greater than.
     * @return an arraylist of Incidents
     */
    public ArrayList<Incident> incidentsGreaterThanValue(double value){
        ArrayList<Incident> temp = new ArrayList<>();
        for ( Incident i: allIncidents) {
            if (i.getValue() > value && !temp.contains(i)) {
                temp.add(i);
            }
        }
        return temp;
    }
}
