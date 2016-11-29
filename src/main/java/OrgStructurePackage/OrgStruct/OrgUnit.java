package OrgStructurePackage.OrgStruct;

import EmployeeManagementPackage.Position;

import java.util.*;

/**
 * @author Cobra
 */
public class OrgUnit {

    public OrgUnit(int deptNumber, Set<Position> positions, Account fund, OrgUnitHead unitHead) {
        mDeptNumber = deptNumber;
        mPositions = positions;
        mFund = fund;
        mUnitHead = unitHead;
        mSubsidiaries = new HashSet<>();
    }

    public OrgUnit(int deptNumber, OrgUnitHead unitHead) {
        mDeptNumber = deptNumber;
        mUnitHead = unitHead;
        mSubsidiaries = new HashSet<>();
    }

    public OrgUnit(int deptNumber) {
        mDeptNumber = deptNumber;
    }

    private int mDeptNumber;
    private Set<Position> mPositions;
    private Account mFund;
    private OrgUnitHead mUnitHead;
    private Set<OrgUnit> mSubsidiaries;

    public void addPosition(Position pos){
        mPositions.add(pos);
    }
    public int getDeptNumber() {
        return mDeptNumber;
    }

    public Set<Position> getPositions() {
        return mPositions;
    }

    public Account getFund() {
        return mFund;
    }

    public OrgUnitHead getUnitHead() {
        return mUnitHead;
    }

    public void addSubsidiary(OrgUnit unit){
        mSubsidiaries.add(unit);
    }


    public void setUnitHead(OrgUnitHead unitHead) {
        mUnitHead = unitHead;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrgUnit orgUnit = (OrgUnit) o;

        return mDeptNumber == orgUnit.mDeptNumber;

    }

    @Override
    public int hashCode() {
        return mDeptNumber;
    }

    @Override
    public String toString() {
        return "OrgUnit{" +
                "mDeptNumber=" + mDeptNumber +
                ", mPositions=" + mPositions +
                ", mFund=" + mFund +
                ", mUnitHead=" + mUnitHead +
                '}';
    }
}