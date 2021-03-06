import java.util.ArrayList;
import java.util.List;

/**
 * This is class stores arraylists of all Districts and all Incidents.
 * Mainly is used for storing methods that are used in ReportingIO class.
 *
 * @author Raminta Misiunaite
 */
public class Reporting {

    List<District> districtList = new ArrayList<>();
    List<Incident> allIncidents = new ArrayList<>();

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

    public List<Incident> putAllIncidentsToList(){
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

    /**
     * This method creates an arraylist of all incidents recorded with value greater
     * than a given amount of money.
     * @param value user's input of double value that incidents have to be greater than.
     * @return an arraylist of Incidents
     */
    public List<Incident> incidentsGreaterThanValue(double value){
        List<Incident> temp = new ArrayList<>();
        for ( Incident i: allIncidents) {
            if (i.getValue() > value && !temp.contains(i)) {
                temp.add(i);
            }
        }
        return temp;
    }
}
