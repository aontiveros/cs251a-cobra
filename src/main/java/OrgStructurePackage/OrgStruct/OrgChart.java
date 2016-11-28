package OrgStructurePackage.OrgStruct;

import java.util.*;

/**
 * @author Cobra
 */
public class OrgChart {

    public OrgChart(Set<OrgUnit> units) {
        mUnits = units;
    }

    private Set<OrgUnit> mUnits;

    public Set<OrgUnit> getUnits() {
        return mUnits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrgChart orgChart = (OrgChart) o;

        return mUnits.equals(orgChart.mUnits);

    }

    @Override
    public int hashCode() {
        return mUnits.hashCode();
    }

    @Override
    public String toString() {
        return "OrgChart{" +
                "mUnits=" + mUnits +
                '}';
    }

}