package EmployeeManagementPackage;

import OrgStructurePackage.OrgStruct.Benefit;
import OrgStructurePackage.OrgStruct.OrgUnit;
import OrgStructurePackage.OrgStruct.Specification;

import java.util.*;

/**
 * @author Cobra
 */
public class Position {

    /**
     * Default constructor
     */
    public Position() {
    }

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private String soc;

    /**
     * 
     */
    private PayScale mSalary;

    /**
     * 
     */
    private OrgUnit mOrgUnit;

    /**
     * 
     */
    private Set<Benefit> mBenefits;

    /**
     * 
     */
    private Specification mSpecification;

    /**
     * 
     */
    private Set<Shift> mShift;

    /**
     * 
     */
    private Set<Shift> mShifts;

}