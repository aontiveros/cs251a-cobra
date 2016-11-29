package hrms.system;

import EmployeeManagementPackage.Employee;
import EmployeeManagementPackage.Manager;
import EmployeeManagementPackage.Position;
import IdentityInformation.HRAdmin;
import IdentityInformation.Person;
import OrgStructurePackage.OrgStruct.Supervisor;
import PayrollPackage.Payroll.PaymentTypes;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.HashSet;

/**
 * Created by anton on 11/19/2016.
 */
public class HRMS {
//    private static final Logger logger = Logger.getLogger(HRMS.class);
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





        // Apache testing stuff.  WIP.
//        logger.info("Hello there");
//        logger.info("The application is working!");
    }
}
