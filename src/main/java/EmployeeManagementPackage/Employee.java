package EmployeeManagementPackage;

import IdentityInformation.Guest;
import IdentityInformation.Person;
import OrgStructurePackage.OrgStruct.*;

import java.util.*;

/**
 * @author Cobra
 */
public class Employee extends Guest {

    /**
     * Default constructor
     */
    public Employee() {
    }

    /**
     * 
     */
    private String SSN;

    /**
     * 
     */
    private Date hireDate;

    /**
     * 
     */
    private Person mActor;

    /**
     * 
     */
    private Set<Person> mDependents;

    /**
     * 
     */
    private Position mPosition;

    /**
     * 
     */
    private Set<Action> mActions;

    /**
     * 
     */
    private Set<Evaluation> mEvaluations;

    /**
     * 
     */
    private Status mStatus;

    /**
     * 
     */
    private Manager mSupervisor;

    /**
     * @param benefit
     */
    public void enrollInBenefits(Benefit benefit) {
        // TODO implement here
    }

    /**
     * 
     */
    public void viewOrgChart() {
        // TODO implement here
    }

    /**
     * 
     */
    public void viewEvaluation() {
        // TODO implement here
    }

}