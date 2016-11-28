package PayrollPackage.Payroll;

import EmployeeManagementPackage.Employee;

import java.util.*;

/**
 * @author Cobra
 */
public abstract class Payment {

    /**
     * Default constructor
     */
    public Payment() {
    }

    /**
     * 
     */
    protected double amount;

    /**
     * 
     */
    protected Set<Employee> mPayrollList;

}