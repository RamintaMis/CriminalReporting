import java.util.Scanner;


public class ReportingIO {

     Reporting r;

    public ReportingIO() {
        this.r = new Reporting();
    }

    public static void main(String[] args) {

        ReportingIO rio = new ReportingIO();

        Incident i = new Incident(67.8, "NE245","December",2020);
        Incident i1 = new Incident(45.7,"SW1W", "Feb", 2012);
        Incident i2 = new Incident(5, "NE265", "April", 2020);
        Incident i3 = new Incident(8000, "PO16", "May", 2015);
        Incident i4 = new Incident(687, "PO1", "October", 2020);
        Incident i5 = new Incident(278, "GU16", "January", 2008);
        Incident i6 = new Incident(90, "NE16", "December", 2018);

        District d = new District("District1");
        District d1 = new District("District2");
        District d2 = new District("District3");
        District d3 = new District("District4");

        d.addIncidentToAList(i);
        d.addIncidentToAList(i2);
        d.addIncidentToAList(i6);
        d1.addIncidentToAList(i1);
        d2.addIncidentToAList(i3);
        d2.addIncidentToAList(i4);
        d3.addIncidentToAList(i5);
        rio.r.addDistrict(d);
        rio.r.addDistrict(d1);
        rio.r.addDistrict(d2);
        rio.r.addDistrict(d3);
        rio.r.putAllIncidentsToList();

//        System.out.println("district 1: ");
//        d.getIncidentList();
//        System.out.println("district2");
//        d1.getIncidentList();
//        System.out.println("district 3: ");
//        d2.getIncidentList();
//        System.out.println("district4");
//        d3.getIncidentList();


//        System.out.println("District list");
//          rio.r.printDistrictList();
//        System.out.println("the highest value in district 1: ");
//        System.out.println(d.highestValueIncident());
//
//        System.out.println("the highest value in district 4: ");
//        System.out.println(d3.highestValueIncident());

//
//        System.out.println("the average incident value in dist1 in 2020:");
//        System.out.println(d.averageIncidentValue(2020));
//        System.out.println("the average incident value in dist2 in 2015:");
//        System.out.println(d2.averageIncidentValue(2015));

//
//        System.out.println("incidents with greater value then from dis1");
//        System.out.println(d.incidentsWithGreaterValue(10));
//        System.out.println("incidents with greater value then from dis2");
//        System.out.println(d1.incidentsWithGreaterValue(100));

//        System.out.println("The district with the largest average value incident");
//        System.out.println(rio.r.largestAvgValue(2020));


//        rio.r.printAllIncidents();
//        System.out.println("largest value ever: ");
//        System.out.println(rio.r.largestValueIncident());
//        System.out.println("all incidents worth more than");
//        System.out.println(rio.r.incidentsGreaterThanValue(50));


        System.out.println("Please choose an action: \n" +
                "1: Enter District data\n" + "2: Enter Incident data\n"
                + "3: Provide reporting statistics on: \n  - district with largest average value incident for a " +
                "given  year\n  - highest incident  ever reported\n  - all  incidents  with  value greater than " +
                "a given amount\n" + "4: Exit");

        boolean quit = false;
        int choice;

        while(!quit){
            System.out.println("Please choose a command");
            Scanner s = new Scanner(System.in);
            do{
                while(!s.hasNextInt()){
                    System.out.println("That is not a number, please choose appropriate number");
                    s.next();
                }
                choice = s.nextInt();

            }while(choice < 0);

            switch (choice){
                case 1:
                    System.out.println("You have selected option 1");
                    System.out.println("Entering new District data");
                    System.out.println("Choose to:\n 1) Enter just district name\n 2) Enter name and incident list ");
                    int enter = s.nextInt();
                    switch (enter){
                        case 1:
                            Scanner s1 = new Scanner(System.in);
                            System.out.println("Enter name");
                            String name =  s1.nextLine();
                            District newD = new District(name);
                            rio.r.addDistrict(newD);
                            break;
                        case 2:
                            Scanner s2 = new Scanner(System.in);
                            System.out.println("Enter name");
                            String name1 =  s2.nextLine();
                            District newD1 = new District(name1);
                            rio.r.addDistrict(newD1);
                            System.out.println("How many Incidents you want to add?");
                            int num = s2.nextInt();
                            for (int j = 0; j<num; j++){
                                //Scanner s3 = new Scanner(System.in);
                                System.out.println("Enter incident data:");
                                System.out.println("Enter value: ");
                                double value = s2.nextDouble();
                                s2.nextLine();
                                System.out.println("Enter postcode:");
                                String post = s2.nextLine();
                                System.out.println("Enter month:");
                                String m = s2.nextLine();
                                System.out.println("Enter year: ");
                                int y = s2.nextInt();
                                Incident newInc = new Incident(value, post, m, y);
                                newD1.addIncidentToAList(newInc);
                            }
                            break;
                    }
                    break;

                case 2:
                    System.out.println("You have selected option 2");
                    System.out.println("Entering incident data");
                    System.out.println("Enter incident data:");
                    System.out.println("Enter value: ");
                    double value = s.nextDouble();
                    s.nextLine();
                    System.out.println("Enter postcode:");
                    String post = s.nextLine();
                    System.out.println("Enter month:");
                    String m = s.nextLine();
                    System.out.println("Enter year: ");
                    int y = s.nextInt();
                    Incident newInc = new Incident(value, post, m, y);
                    rio.r.allIncidents.add(newInc);
                    break;

                case 3:
                    System.out.println("You have selected option 3");
                    System.out.println("1) Enter the year you wish to see the district with" +
                            " largest average value incident");
                    int choice1 = s.nextInt();
                    System.out.println(rio.r.largestAvgValue(choice1));
                    System.out.println("2) Highest incident ever reported:\n " + rio.r.largestValueIncident());
                    System.out.println("3) Please enter the value that listed incidents have to be greater than");
                    double choice2 = s.nextDouble();
                    System.out.println(rio.r.incidentsGreaterThanValue(choice2));
                    break;

                case 4:
                    System.out.println("You have selected option 4");
                    System.out.println("Quitting program");
                    quit = true;
                    break;
                default:
                    System.out.println("Not a valid choice");
            }
        }

    }
}

