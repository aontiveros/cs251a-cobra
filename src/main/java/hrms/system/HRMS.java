package hrms.system;

import EmployeeManagementPackage.Employee;
import EmployeeManagementPackage.Manager;
import EmployeeManagementPackage.Position;
import IdentityInformation.Address;
import IdentityInformation.HRAdmin;
import IdentityInformation.Person;
import OrgStructurePackage.OrgStruct.Supervisor;
import PayrollPackage.Payroll.PaymentTypes;
import OrgStructurePackage.OrgStruct.OrgChart;
import OrgStructurePackage.OrgStruct.OrgUnit;
import OrgStructurePackage.OrgStruct.OrgUnitHead;

import java.util.*;
import java.util.HashSet;

/**
 * Created by anton on 11/19/2016.
 */
public class HRMS {
//    private static final Logger logger = Logger.getLogger(HRMS.class);

    private static final Set<Employee> sEmployees = new HashSet<>();
    private static final HashMap<String, Position> sPositions = new HashMap<>();

    private static final HashMap<String, OrgUnit> organizationalUnits = new HashMap<>();
    private static final HashMap<String, OrgUnitHead> organizationalUnitHeads = new HashMap<>();

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Hello world");

        // Declaring attributes for HR Admin
        Person Bob = new Person("Bob");
        Set<Person> dependentsOFBob = new HashSet<>();
        dependentsOFBob.add(new Person("Clara"));
        Position HRPos = new Position("HR Specialist");
        Manager bossOfBob = new Manager("87234");
        HRAdmin HRSpecialist = new HRAdmin("12345", new Date(1220227200L*1000),
                Bob, dependentsOFBob, HRPos, bossOfBob);

        // Here's our HR specialist!
        System.out.println("Here is our HR Specialist");
        System.out.println(HRSpecialist);

        // Payroll Test
        HRSpecialist.issueBulkPayment();
        Set<Employee> payBonusToThesePeople = new HashSet<>();
        payBonusToThesePeople.add(new Employee("1243"));
        payBonusToThesePeople.add(new Employee("7231"));
        HRSpecialist.issueIndividualPayment(3000, payBonusToThesePeople, PaymentTypes.BONUS);

        repl();
    }



    public static void repl(){
        String command = "";
        do{
            try{
            command = in.nextLine().toLowerCase();
                switch (command) {
                    case "1":
                        addOrganizationalUnit();
                        break;
                    case "2":
                        addEmployee();
                        break;
                    case "3":
                        viewPositions();
                        break;
                    case "4":
                        System.out.println("To be added");
                    default:
                }
            }catch(Exception ex){
                System.out.println("Invalid command, try again:");
            }
            printMenu();
        }while(!command.toLowerCase().equals("6"));
        in.close();
    }

    public static void printMenu(){
        System.out.println("Please select the number of the command you wish to use:\n" +
                "1. Add an Organizational Unit\n" +
                "2. Add an Employee\n" +
                "3. View the organizational chart\n" +
                "4. View positions\n" +
                "5. Add a position\n" +
                "6. Quit");
    }

    public static void viewPositions(){
        System.out.println("Organizational Units");
        for(String org : organizationalUnits.keySet()){
            System.out.println("Org unit: " + org + " ");
            System.out.print("\tPositions: ");
            if(organizationalUnits.get(org).getPositions().isEmpty()){
                System.out.print("No Positions for Unit");
            }
            else {
                for (Position pos : organizationalUnits.get(org).getPositions()) {
                    System.out.print(pos.getTitle() + " ");
                }
            }
            System.out.println();
        }
    }

    public static void viewOrganizationalUnits(){
        System.out.println("Organizational Units");
        for(String org : organizationalUnits.keySet()){
            System.out.println(org + " ");
        }
    }

    public static void addEmployee(){
        String orgUnit, position, name;
        Employee employee;
        if(OrgChart.getOrgChart().getUnits().isEmpty()){
            System.out.println("Please create an organization before attempting to add an employee");
        }
        else{
            System.out.println("Which organizational unit would you like to add the employee to?");
            for(String unit : organizationalUnits.keySet()){
                System.out.print(unit + " ");
            }
            System.out.println();
            orgUnit = in.nextLine();
            if(organizationalUnits.get(orgUnit) != null && organizationalUnits.get(orgUnit).getPositions().isEmpty()){
                System.out.println("Please select a position:");
                for(Position pos : organizationalUnits.get(orgUnit).getPositions()){
                    System.out.print(pos.getTitle() + " '");
                }
                System.out.println();
                position = in.nextLine();

               // employee = new Employee();
            }

        }
    }

    public static Address getAddress(){

        String number, street, city, zip, state;
        System.out.println("Please enter a number: ");
        number = in.nextLine();
        System.out.println("Please enter a street name: ");
        street = in.nextLine();
        System.out.println("Please enter a city:");
        city = in.nextLine();
        System.out.println("Please enter a zip code:");
        zip = in.nextLine();
        System.out.println("Please enter a state:");
        state = in.nextLine();

        //Address address = new Address(Integer.parseInt(number, ));
        return null;
    }

    public static void addOrganizationalUnit(){
        String name, id, isHead, hasPositions, input;
        System.out.println("What is the name of the organizational unit to add?");
        name = in.nextLine();
        System.out.println("What is the id (integer) of the organizational unit to add?");
        id = in.nextLine();

        OrgUnit newOrgUnit = new OrgUnit(Integer.parseInt(id));

        OrgChart orgChart = OrgChart.getOrgChart();
        orgChart.addUnit(newOrgUnit);
        System.out.println("Would you like to add a position to the unit (true/false)?");
        hasPositions = in.nextLine();
        if(Boolean.parseBoolean(hasPositions)){
            do {
                System.out.println("Select a position to add to the organizational unit [-1 to quit]:");
                for (String pos : sPositions.keySet()) {
                    System.out.print(sPositions.get(pos).getTitle());
                }
                input = in.nextLine();
                if(!sPositions.containsKey(input) || input.equals("-1")){
                    System.out.println("Please enter a proper position to add");
                }
                else{
                    newOrgUnit.addPosition(sPositions.get(input));
                    System.out.println("Position added!");
                }
            }while(!input.equals("-1"));
        }
        System.out.println("New organizational unit has been added!");
    }
}
