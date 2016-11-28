package OrgStructurePackage.OrgStruct;

import java.util.*;

/**
 * @author Cobra
 */
public class OrgUnitHead {

    public OrgUnitHead(UnitHeadType headType) {
        mHeadType = headType;
    }

    private UnitHeadType mHeadType;

    public UnitHeadType getHeadType() {
        return mHeadType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrgUnitHead that = (OrgUnitHead) o;

        return mHeadType == that.mHeadType;

    }

    @Override
    public int hashCode() {
        return mHeadType.hashCode();
    }

    @Override
    public String toString() {
        return "OrgUnitHead{" +
                "mHeadType=" + mHeadType +
                '}';
    }
}