package IdentityInformation;

import EmployeeManagementPackage.Actor;
import java.util.*;


/**
 * @author Cobra
 */
public class Person implements Actor {

    public Person(String name, Date dob, Gender mGender, Address mAddress, PhoneNumber mWorkNumber, PhoneNumber mHomeNumber, PhoneNumber mCellNumber, Ethnicity mEthnicity, Set<Disability> mDisabilities, Email mEmail) {
        this.name = name;
        this.dob = dob;
        this.mGender = mGender;
        this.mAddress = mAddress;
        this.mWorkNumber = mWorkNumber;
        this.mHomeNumber = mHomeNumber;
        this.mCellNumber = mCellNumber;
        this.mEthnicity = mEthnicity;
        this.mDisabilities = mDisabilities;
        this.mEmail = mEmail;
    }

    public Person(String name) {
        this.name = name;
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Date dob;

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

}