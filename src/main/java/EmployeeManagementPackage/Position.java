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

    public Position(String title, String soc,OrgUnit mOrgUnit) {
        this.title = title;
        this.soc = soc;
        this.mOrgUnit = mOrgUnit;
    }

    public Position(String title) {
        this.title = title;
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

    public String getTitle() {
        return title;
    }

    public String getSoc() {
        return soc;
    }

    public PayScale getSalary() {
        return mSalary;
    }

    public OrgUnit getOrgUnit() {
        return mOrgUnit;
    }

    public Set<Benefit> getBenefits() {
        return mBenefits;
    }

    public Specification getSpecification() {
        return mSpecification;
    }

    public Set<Shift> getShift() {
        return mShift;
    }

    public Set<Shift> getShifts() {
        return mShifts;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}