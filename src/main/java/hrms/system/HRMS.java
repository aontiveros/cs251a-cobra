package hrms.system;

import EmployeeManagementPackage.Employee;
import EmployeeManagementPackage.Manager;
import EmployeeManagementPackage.Position;
import IdentityInformation.*;
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

    public static final Set<Employee> sEmployees = new HashSet<>();
    public static final HashMap<String, Position> sPositions = new HashMap<>();

    private static final HashMap<String, OrgUnit> organizationalUnits = new HashMap<>();
    private static final HashMap<String, OrgUnitHead> organizationalUnitHeads = new HashMap<>();

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){


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
            printMenu();
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
                        viewOrganizationalUnits();
                        break;
                    case "4":
                        viewPositions();
                        break;
                    case "5":
                        addPositions();
                        break;
                    default:
                }
            }catch(Exception ex){
                ex.printStackTrace();
                System.out.println("Invalid command, try again:");
            }

        }while(!command.toLowerCase().equals("6"));
        in.close();
    }

    public static void addPositions(){
        String title, org, code;
        OrgUnit uniter;
        System.out.println("What is the position title?");
        title = in.nextLine();
        System.out.println("What is the org unit it is associated with?");
        for(String unit : organizationalUnits.keySet()){
            System.out.print(unit + " ");
        }
        System.out.println();
        org = in.nextLine();
        System.out.println("What is the SOC code?");
        code = in.nextLine();
        if(organizationalUnits.containsKey(org)){
            uniter = organizationalUnits.get(org);
            Position pos = new Position(title, code, organizationalUnits.get(org));
            organizationalUnits.get(org).addPosition(pos);
            sPositions.put(pos.getTitle(), pos);
        }
        else{
            System.out.println("Please try again....");
        }

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
            if(organizationalUnits.get(org).getPositions() == null || organizationalUnits.get(org).getPositions().isEmpty()){
                System.out.print("No Positions for Unit");
            }
            else {
                for (Position pos : organizationalUnits.get(org).getPositions()) {
                    if(pos != null)
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
        String orgUnit, position, name, social;
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
            if(organizationalUnits.get(orgUnit) != null && !organizationalUnits.get(orgUnit).getPositions().isEmpty()){
                System.out.println("Please select a position:");
                for(Position pos : organizationalUnits.get(orgUnit).getPositions()){
                    System.out.print(pos.getTitle() + " '");
                }
                System.out.println();
                position = in.nextLine();
                System.out.println("Please describe the employee:");
                Person person = getPerson();
                Set<Person> dependents = new HashSet<>();
                System.out.println("How many dependents?");
                int count = in.nextInt();
                while(count > 0){
                    System.out.println("Dependent: " + count);
                    dependents.add(getPerson());
                    count--;
                }
                System.out.println("What is their social?");
                social = in.nextLine();
                employee = new Employee(social, new GregorianCalendar().getTime(), person, dependents, sPositions.get(position));
                sEmployees.add(employee);
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

        Address address = new Address(Integer.parseInt(number), street, city, state, Integer.parseInt(zip));
        return address;
    }

    public static Person getPerson(){
        String name;
        Gender gender;
        Set<Disability> disability = new HashSet<>();
        Ethnicity eth;
        Address addres;
        Email email;
        PhoneNumber home, cell, work;
        Person newPerson = null;
        System.out.println("What is the person's name?");
        name = in.nextLine();
        home = getPhone("home");
        cell = getPhone("cell");
        work = getPhone("work");
        System.out.println("What is their address?");
        addres = getAddress();
        email = getEmail();
        eth = getEthnicity();
        disability = getDisability();
        gender = getGender();
        return new Person(name, new GregorianCalendar().getTime(), gender, addres, work, home, cell, eth, disability, email);

    }

    public static Gender getGender(){
        String gender;
        System.out.print("What is their Gender ? ( ");
        for(Gender type : Gender.values()){
            System.out.print(" " + type + " ");
        }
        System.out.println(")");
        gender = in.nextLine();
        for(Gender type : Gender.values()){
            if(gender.toLowerCase().equals(type.toString().toLowerCase())){
                return type;
            }
        }
        return Gender.DECLINETOSTATE;
    }

    public static Set<Disability> getDisability(){
        String dis;
        Set<Disability> disabilities = new HashSet<>();
        System.out.print("What is their disability ? ( q for finished, NONE ");
        for(DisabilityType type : DisabilityType.values()){
            System.out.print(" " + type + " ");
        }
        System.out.println(")");
        dis = in.nextLine();
        if(dis.equals("q"))
            return disabilities;
        for(DisabilityType type : DisabilityType.values()){
            if(dis.toLowerCase().equals(type.toString().toLowerCase())){
                disabilities.add(new Disability(type));
            }
        }
        return disabilities;
    }

    public static Ethnicity getEthnicity(){
        String eth;
        System.out.print("What is their ethnicity? (");
        for(EthnicityType type : EthnicityType.values()){
            System.out.print(" " + type + " ");
        }
        System.out.println(")");
        eth = in.nextLine();
        for(EthnicityType type : EthnicityType.values()){
            if(type.toString().toLowerCase().equals(eth.toLowerCase()))
                return new Ethnicity(type);
        }
        return new Ethnicity(EthnicityType.OTHER);
    }

    public static Email getEmail(){
        String username, domain, mailserver;
        System.out.println("What is the username?");
        username = in.nextLine();
        return  new Email(username);
    }

    public static PhoneNumber getPhone(String type){

        String area, country, number, extension;
        System.out.println("What is the " + type + " phone area code? XXX");
        area = in.nextLine();
        System.out.println("What is the " + type + " phone number? (XXX-XXXX)");
        number = in.nextLine();
        System.out.println("What is the country code? ");
        country = in.nextLine();
        System.out.println("What is the extension? (0 for none)");
        extension = in.nextLine();
        return new PhoneNumber(area, country, extension, number);
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
        organizationalUnits.put(name, newOrgUnit);
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
