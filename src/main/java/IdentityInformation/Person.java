package IdentityInformation;

import EmployeeManagementPackage.Actor;
import java.util.*;


/**
 * @author Cobra
 */
public class Person implements Actor {

    public Person(String name, Date dob, Gender mGender, Address mAddress, PhoneNumber mWorkNumber, PhoneNumber mHomeNumber, PhoneNumber mCellNumber, Ethnicity mEthnicity, Set<Disability> mDisabilities, Email mEmail) {
        this.mName = name;
        this.mDob = dob;
        this.mGender = mGender;
        this.mAddress = mAddress;
        this.mWorkNumber = mWorkNumber;
        this.mHomeNumber = mHomeNumber;
        this.mCellNumber = mCellNumber;
        this.mEthnicity = mEthnicity;
        this.mDisabilities = mDisabilities;
        this.mEmail = mEmail;
    }

    public Person(String name, Date dob, Gender mGender, Address mAddress, PhoneNumber mWorkNumber, PhoneNumber mHomeNumber, PhoneNumber mCellNumber, Ethnicity mEthnicity, Email mEmail) {
        this.mName = name;
        this.mDob = dob;
        this.mGender = mGender;
        this.mAddress = mAddress;
        this.mWorkNumber = mWorkNumber;
        this.mHomeNumber = mHomeNumber;
        this.mCellNumber = mCellNumber;
        this.mEthnicity = mEthnicity;
        this.mDisabilities = new HashSet<>();
        this.mEmail = mEmail;
    }

    /**
     * 
     */
    private String mName;

    /**
     * 
     */
    private Date mDob;

    /**
     * 
     */
    private Gender mGender;

    /**
     * 
     */
    private Address mAddress;

    /**
     * 
     */
    private PhoneNumber mWorkNumber,mHomeNumber,mCellNumber;

    /**
     * 
     */
    private Ethnicity mEthnicity;

    /**
     * 
     */
    private Set<Disability> mDisabilities;

    /**
     * 
     */
    private Email mEmail;

    public String getName() {
        return mName;
    }

    public Date getDob() {
        return mDob;
    }

    public Gender getGender() {
        return mGender;
    }

    public Address getAddress() {
        return mAddress;
    }

    public PhoneNumber getWorkNumber() {
        return mWorkNumber;
    }

    public PhoneNumber getHomeNumber() {
        return mHomeNumber;
    }

    public PhoneNumber getCellNumber() {
        return mCellNumber;
    }

    public Ethnicity getEthnicity() {
        return mEthnicity;
    }

    public Set<Disability> getDisabilities() {
        return mDisabilities;
    }

    public Email getEmail() {
        return mEmail;
    }

    public void addDisability(Disability disability){
        mDisabilities.add(disability);
    }

    public void setWorkNumber(PhoneNumber workNumber) {
        mWorkNumber = workNumber;
    }

    public void setHomeNumber(PhoneNumber homeNumber) {
        mHomeNumber = homeNumber;
    }

    public void setCellNumber(PhoneNumber cellNumber) {
        mCellNumber = cellNumber;
    }
}