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
    private double paymentToAllEmployeesAmount = 100000000;
    public BulkPayment() {
        super.setAmount(paymentToAllEmployeesAmount);
    }

    public BulkPayment(double amount, Set<Employee> payrollList) {
        super(amount, payrollList);
    }

    public BulkPayment(double amount) {
        super(amount);
    }

    public void sendPayment() {
        System.out.println("Sending bulk payment of amount ");
        System.out.println(super.getAmount());
    }

    @Override
    public String toString() {
        return "BulkPayment amount is { " + super.getAmount() + " to all employees }";
    }
}