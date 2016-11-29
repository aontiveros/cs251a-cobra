package EmployeeManagementPackage;

import java.util.*;

/**
 * @author Cobra
 */
public class PayScale {

    public PayScale(double base, int bonusMin, int bonusMax, EmployementType mType, Period mPeriod) {
        this.base = base;
        this.bonusMin = bonusMin;
        this.bonusMax = bonusMax;
        this.mType = mType;
        this.mPeriod = mPeriod;
    }

    /**
     * 
     */
    private double base;

    /**
     * 
     */
    private int bonusMin;

    /**
     * 
     */
    private int bonusMax;

    /**
     * 
     */
    private EmployementType mType;

    /**
     * 
     */
    private Period mPeriod;

    @Override
    public String toString() {
        return "PayScale{" +
                "base=" + base +
                ", bonusMin=" + bonusMin +
                ", bonusMax=" + bonusMax +
                ", mType=" + mType +
                ", mPeriod=" + mPeriod +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PayScale payScale = (PayScale) o;

        if (Double.compare(payScale.base, base) != 0) return false;
        if (bonusMin != payScale.bonusMin) return false;
        if (bonusMax != payScale.bonusMax) return false;
        if (mType != payScale.mType) return false;
        return mPeriod == payScale.mPeriod;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(base);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + bonusMin;
        result = 31 * result + bonusMax;
        result = 31 * result + (mType != null ? mType.hashCode() : 0);
        result = 31 * result + (mPeriod != null ? mPeriod.hashCode() : 0);
        return result;
    }
}