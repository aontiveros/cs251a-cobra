package OrgStructurePackage.OrgStruct;

import java.util.*;

/**
 * @author Cobra
 */
public class Account {

    public Account(double balance) {
        mBalance = balance;
    }

    private double mBalance;

    public double getBalance() {
        return mBalance;
    }

    public void withdraw(double amount) {
        mBalance -= amount;
    }

    public void deposit(double amount) {
        mBalance += amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return Double.compare(account.mBalance, mBalance) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(mBalance);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Account{" +
                "mBalance=" + mBalance +
                '}';
    }
}