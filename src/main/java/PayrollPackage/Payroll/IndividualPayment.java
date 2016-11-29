package PayrollPackage.Payroll;

import EmployeeManagementPackage.Employee;

import java.util.*;

/**
 * @author Cobra
 */
public class IndividualPayment extends Payment {

    public IndividualPayment(PaymentTypes type) {
        mType = type;
    }

    public IndividualPayment(double amount, Set<Employee> payrollList, PaymentTypes type) {
        super(amount, payrollList);
        mType = type;
    }

    private PaymentTypes mType;

    public PaymentTypes getType() {
        return mType;
    }

    public void setType(PaymentTypes type) {
        mType = type;
    }

    public void sendPayment() {
        System.out.println("Sending individual payment of amount ");
        System.out.println(super.getAmount());
        System.out.println("To these top employees ");
        System.out.println(getListOfEmployeesPaid());
    }

    public Set<Employee> getListOfEmployeesPaid() {
        return super.getPayrollList();
    }

    public double getPaymentAmount() {
        return super.getAmount();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        IndividualPayment that = (IndividualPayment) o;

        return mType == that.mType;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + mType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "IndividualPayment{" +
                "mType=" + mType + " of amount " + getPaymentAmount() + " to " + getListOfEmployeesPaid() +
                '}';
    }
}