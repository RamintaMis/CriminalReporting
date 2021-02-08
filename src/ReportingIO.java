import javax.naming.InitialContext;
import java.sql.SQLTransientConnectionException;
import java.util.Scanner;

public class ReportingIO {

    public static void main(String[] args) {

        Incident i = new Incident(67.8, "2345",12,2020);
        Incident i1 = new Incident(45.7,"5678", 5, 2020);
        Incident i2 = new Incident(5, "2345", 6, 2020);
        Incident i3 = new Incident(88888, "5678", 7, 2020);
        Incident i4 = new Incident(687, "5678", 4, 2020);


        District d = new District("District1");
        District d1 = new District("District2");
        d.addIncidentToAList(i);
        d1.addIncidentToAList(i1);
        d.addIncidentToAList(i2);
        d1.addIncidentToAList(i3);
        d1.addIncidentToAList(i4);

//        System.out.println("district 1: ");
//        d.getIncidentList();
//        System.out.println("district2");
//        d1.getIncidentList();

        Reporting r = new Reporting();
        r.addDistrict(d);
        r.addDistrict(d1);
//        System.out.println("District list");
//        r.printDistrictList();
//        System.out.println("the highest value in distrct 1: ");
//        System.out.println(d.highestValueIncident());
//
//        System.out.println("the highest value in distrct 2: ");
//        System.out.println(d1.highestValueIncident());
//
//        System.out.println("the average incident value in dist1 in 2020:");
//        System.out.println(d.averageIncidentValue(2020));
//        System.out.println("the average incident value in dist2 in 2020:");
//        System.out.println(d1.averageIncidentValue(2020));
//        System.out.println("incidents with greater value then from dis1");
//        System.out.println(d.incidentsWithGreaterValue(10));
//        System.out.println("incidents with greater value then from dis2");
//        System.out.println(d1.incidentsWithGreaterValue(100));
//        System.out.println("The district with the largest average value incident");
//        System.out.println(r.largestAvgValue(2020));
        r.putAllIncidentsToList();
        System.out.println(r.allIncidents);
//        System.out.println("largest value ever: ");
//        System.out.println(r.largestValueIncident());
//        System.out.println("all incidents worth more than");
//        System.out.println(r.incidentsGreaterThanValue(50));






        /* System.out.println("Please choose an action: \n" +
                "1: Enter District data\n" + "2: Enter Incident data\n"
                + "3: Provide reporting statistics on: \n  - district with largest average value incident for a " +
                "given  year\n  - highest incident  ever reported\n  - all  incidents  with  value greater than " +
                "a given amount\n" + "4: Exit");


        Scanner s = new Scanner(System.in);

        boolean quit = false;
        while(!quit){
            int choice = s.nextInt();
            switch (choice){
                case 1:
                    System.out.println("You have selected option 1");
                    break;

                case 2:
                    System.out.println("You have selected option 2");
                    break;

                case 3:
                    System.out.println("You have selected option 3");
                    break;

                case 4:
                    System.out.println("You have selected option 4");
                    System.out.println("Quitting programm");
                    quit = true;
                    break;
                default:
                    System.out.println("Not a valid choice");
            }
        } */

    }

}
