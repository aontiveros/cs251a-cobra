package OrgStructurePackage.OrgStruct;

import EmployeeManagementPackage.Position;

import java.util.*;

/**
 * @author Cobra
 */
public abstract class OrgUnit {

    /**
     * Default constructor
     */
    public OrgUnit() {
    }

    /**
     * 
     */
    protected int mDeptNumber;

    /**
     * 
     */
    private Set<Position> mPositions;

    /**
     * 
     */
    private Account mFund;

    /**
     * 
     */
    private OrgUnitHead mUnitHead;

}