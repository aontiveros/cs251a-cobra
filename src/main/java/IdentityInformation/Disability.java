package IdentityInformation;

import java.util.*;

/**
 * @author Cobra
 */
public class Disability {

    public Disability(DisabilityType disabilityType) {
        mDisabilityType = disabilityType;
    }

    private DisabilityType mDisabilityType;

    public DisabilityType getDisabilityType() {
        return mDisabilityType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Disability that = (Disability) o;

        return mDisabilityType == that.mDisabilityType;

    }

    @Override
    public int hashCode() {
        return mDisabilityType.hashCode();
    }

    @Override
    public String toString() {
        return "Disability{" +
                "mDisabilityType=" + mDisabilityType +
                '}';
    }
}