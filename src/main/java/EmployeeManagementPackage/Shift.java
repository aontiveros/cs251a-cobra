package EmployeeManagementPackage;

import java.sql.Time;
import java.util.*;

/**
 * @author Cobra
 */
public class Shift {

    public Shift(Set<String> days, Time startTime, Time endTime, ShiftType shiftType, ShiftType mShiftType) {
        this.days = days;
        this.startTime = startTime;
        this.endTime = endTime;
        this.shiftType = shiftType;
        this.mShiftType = mShiftType;
    }

    /**
     * 
     */
    private Set<String> days;

    /**
     * 
     */
    private Time startTime;

    /**
     * 
     */
    private Time endTime;

    /**
     * 
     */
    private ShiftType shiftType;

    /**
     * 
     */
    private ShiftType mShiftType;

    public Set<String> getDays() {
        return days;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public ShiftType getShiftType() {
        return shiftType;
    }

    public ShiftType getmShiftType() {
        return mShiftType;
    }

    @Override
    public String toString() {
        return "Shift{" +
                "days=" + days +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", shiftType=" + shiftType +
                ", mShiftType=" + mShiftType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shift shift = (Shift) o;

        if (days != null ? !days.equals(shift.days) : shift.days != null) return false;
        if (startTime != null ? !startTime.equals(shift.startTime) : shift.startTime != null) return false;
        if (endTime != null ? !endTime.equals(shift.endTime) : shift.endTime != null) return false;
        if (shiftType != shift.shiftType) return false;
        return mShiftType == shift.mShiftType;
    }

    @Override
    public int hashCode() {
        int result = days != null ? days.hashCode() : 0;
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (shiftType != null ? shiftType.hashCode() : 0);
        result = 31 * result + (mShiftType != null ? mShiftType.hashCode() : 0);
        return result;
    }
}