package EmployeeManagementPackage;

import java.util.*;

/**
 * @author Cobra
 */
public class Supplier {

    public Supplier(String supplierId, Organization mActor) {
        this.supplierId = supplierId;
        this.mActor = mActor;
    }

    /**
     * 
     */
    private String supplierId;

    /**
     * 
     */
    private Organization mActor;

    public String getSupplierId() {
        return supplierId;
    }

    public Organization getmActor() {
        return mActor;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId='" + supplierId + '\'' +
                ", mActor=" + mActor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Supplier supplier = (Supplier) o;

        if (supplierId != null ? !supplierId.equals(supplier.supplierId) : supplier.supplierId != null) return false;
        return mActor != null ? mActor.equals(supplier.mActor) : supplier.mActor == null;
    }

    @Override
    public int hashCode() {
        int result = supplierId != null ? supplierId.hashCode() : 0;
        result = 31 * result + (mActor != null ? mActor.hashCode() : 0);
        return result;
    }
}