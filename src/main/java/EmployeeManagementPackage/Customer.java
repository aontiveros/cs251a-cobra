package EmployeeManagementPackage;

import java.util.*;

/**
 * @author Cobra
 */
public class Customer {

    /**
     * Default constructor
     */
    public Customer() {
    }

    /**
     * 
     */
    private String custId;

    /**
     * 
     */
    private Actor mActor;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Actor getmActor() {
        return mActor;
    }

    public void setmActor(Actor mActor) {
        this.mActor = mActor;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId='" + custId + '\'' +
                ", mActor=" + mActor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (custId != null ? !custId.equals(customer.custId) : customer.custId != null) return false;
        return mActor != null ? mActor.equals(customer.mActor) : customer.mActor == null;
    }

    @Override
    public int hashCode() {
        int result = custId != null ? custId.hashCode() : 0;
        result = 31 * result + (mActor != null ? mActor.hashCode() : 0);
        return result;
    }
}