package OrgStructurePackage.OrgStruct;

import EmployeeManagementPackage.Employee;
import EmployeeManagementPackage.Position;

import java.util.*;

/**
 * @author Cobra
 */
public class OrgUnitHead extends Employee{

//    public OrgUnitHead(int deptNumber, Set<Position> positions, Account fund, OrgUnitHead unitHead, UnitHeadType headType) {
//        super(deptNumber, positions, fund, unitHead);
//        mHeadType = headType;
//    }

    public OrgUnitHead(UnitHeadType headType){
        super("Donald Trump");
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