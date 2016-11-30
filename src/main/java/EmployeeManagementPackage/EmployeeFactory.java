package EmployeeManagementPackage;

import IdentityInformation.Person;

import java.util.*;

/**
 * @author Cobra
 */
public class EmployeeFactory {

    public static Employee makeEmployee(String SSN, Person person, Position pos) {
        return new Employee(SSN, new GregorianCalendar().getTime(), person, null, pos);
    }

}