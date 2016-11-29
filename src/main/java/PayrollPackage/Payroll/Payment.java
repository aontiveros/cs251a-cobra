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

    public Payment(double amount, Set<Employee> payrollList) {
        mAmount = amount;
        mPayrollList = payrollList;
    }

    public Payment(double amount) {
        mAmount = amount;
    }

    protected double mAmount;

    protected Set<Employee> mPayrollList;

    public double getAmount() {
        return mAmount;
    }

    public void setAmount(double amount) {
        mAmount = amount;
    }

    public Set<Employee> getPayrollList() {
        return mPayrollList;
    }

    public void setPayrollList(Set<Employee> payrollList) {
        mPayrollList = payrollList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        if (Double.compare(payment.mAmount, mAmount) != 0) return false;
        return mPayrollList.equals(payment.mPayrollList);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(mAmount);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + mPayrollList.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "mAmount=" + mAmount +
                ", mPayrollList=" + mPayrollList +
                '}';
    }



}