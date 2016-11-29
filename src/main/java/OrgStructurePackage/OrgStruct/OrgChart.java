package OrgStructurePackage.OrgStruct;

import java.util.*;

/**
 * @author Cobra
 */
public class OrgChart {

    private static OrgChart sOrgChart;

    private OrgChart() {
        mUnits = new HashSet<>();
    }

    private Set<OrgUnit> mUnits;

    public Set<OrgUnit> getUnits() {
        return mUnits;
    }
    public void addUnit(OrgUnit unit){
        mUnits.add(unit);
    }


    public static synchronized OrgChart getOrgChart(){
        if(sOrgChart == null)
            sOrgChart = new OrgChart();
        return sOrgChart;
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