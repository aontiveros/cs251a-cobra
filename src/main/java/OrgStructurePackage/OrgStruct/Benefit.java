package OrgStructurePackage.OrgStruct;

import java.util.*;

/**
 * @author Cobra
 */
public class Benefit {

    public Benefit(BenefitType type) {
        mType = type;
    }

    private BenefitType mType;

    public void setType(BenefitType type) {
        mType = type;
    }

    public BenefitType getType() {
        return mType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Benefit benefit = (Benefit) o;

        return mType == benefit.mType;

    }

    @Override
    public int hashCode() {
        return mType.hashCode();
    }

    @Override
    public String toString() {
        return "Benefit{" +
                "mType=" + mType +
                '}';
    }
}