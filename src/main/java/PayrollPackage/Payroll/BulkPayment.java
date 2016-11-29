package PayrollPackage.Payroll;

import EmployeeManagementPackage.Employee;

import java.util.*;

/**
 * @author Cobra
 */
public class BulkPayment extends Payment {

    /**
     * Default constructor
     */
    public BulkPayment() {
    }

    public BulkPayment(double amount, Set<Employee> payrollList) {
        super(amount, payrollList);
    }

    public BulkPayment(double amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "BulkPayment amount is { " + super.getAmount() + " to all employees }";
    }
}