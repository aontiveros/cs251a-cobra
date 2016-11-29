package EmployeeManagementPackage;

import OrgStructurePackage.OrgStruct.Benefit;
import OrgStructurePackage.OrgStruct.OrgUnit;
import OrgStructurePackage.OrgStruct.Specification;

import java.util.*;

/**
 * @author Cobra
 */
public class Position {

    public Position() {
        //default constructor
    }

    public Position(String title, String soc, PayScale mSalary, OrgUnit mOrgUnit, Set<Benefit> mBenefits, Specification mSpecification, Set<Shift> mShift, Set<Shift> mShifts) {
        this.title = title;
        this.soc = soc;
        this.mSalary = mSalary;
        this.mOrgUnit = mOrgUnit;
        this.mBenefits = mBenefits;
        this.mSpecification = mSpecification;
        this.mShift = mShift;
        this.mShifts = mShifts;
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