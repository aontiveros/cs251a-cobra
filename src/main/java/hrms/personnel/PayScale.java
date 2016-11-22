package hrms.personnel;

import java.util.*;

/**
 * @author Cobra
 */
public class PayScale {

    private double base;
    private int bonuxMin;
    private int bonusMax;
    private EmployementType type;
    private Period period;

    public PayScale(double base, int bonuxMin, int bonusMax, EmployementType type, Period period) {
        this.base = base;
        this.bonuxMin = bonuxMin;
        this.bonusMax = bonusMax;
        this.type = type;
        this.period = period;
    }

    public double getBase() {
        return base;
    }

    public int getBonuxMin() {
        return bonuxMin;
    }

    public int getBonusMax() {
        return bonusMax;
    }

    public EmployementType getType() {
        return type;
    }

    public Period getPeriod() {
        return period;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PayScale)) return false;

        PayScale payScale = (PayScale) o;

        if (Double.compare(payScale.getBase(), getBase()) != 0) return false;
        if (getBonuxMin() != payScale.getBonuxMin()) return false;
        if (getBonusMax() != payScale.getBonusMax()) return false;
        if (getType() != payScale.getType()) return false;
        return getPeriod() == payScale.getPeriod();

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getBase());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + getBonuxMin();
        result = 31 * result + getBonusMax();
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getPeriod() != null ? getPeriod().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PayScale{" +
                "base=" + base +
                ", bonuxMin=" + bonuxMin +
                ", bonusMax=" + bonusMax +
                ", type=" + type +
                ", period=" + period +
                '}';
    }
}