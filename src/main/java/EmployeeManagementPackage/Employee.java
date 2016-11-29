package EmployeeManagementPackage;

import IdentityInformation.Guest;
import IdentityInformation.Person;
import OrgStructurePackage.OrgStruct.*;

import java.util.*;

/**
 * @author Cobra
 */
public class Employee extends Guest {

    public Employee(String SSN, Date hireDate, Person mActor, Set<Person> mDependents, Position mPosition, Set<Action> mActions, Set<Evaluation> mEvaluations, Status mStatus, Manager mSupervisor) {
        this.SSN = SSN;
        this.hireDate = hireDate;
        this.mActor = mActor;
        this.mDependents = mDependents;
        this.mPosition = mPosition;
        this.mActions = mActions;
        this.mEvaluations = mEvaluations;
        this.mStatus = mStatus;
        this.mSupervisor = mSupervisor;
    }

    public Employee(String SSN, Date hireDate, Person actor, Set<Person> dependents, Position position, Status status, Manager supervisor) {
        this.SSN = SSN;
        this.hireDate = hireDate;
        mActor = actor;
        mDependents = dependents;
        mPosition = position;
        mStatus = status;
        mSupervisor = supervisor;
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


    public String getSSN() {
        return SSN;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public Person getmActor() {
        return mActor;
    }

    public Set<Person> getmDependents() {
        return mDependents;
    }

    public Position getmPosition() {
        return mPosition;
    }

    public Set<Action> getmActions() {
        return mActions;
    }

    public Set<Evaluation> getmEvaluations() {
        return mEvaluations;
    }

    public Status getmStatus() {
        return mStatus;
    }

    public Manager getmSupervisor() {
        return mSupervisor;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "SSN='" + SSN + '\'' +
                ", hireDate=" + hireDate +
                ", mActor=" + mActor +
                ", mDependents=" + mDependents +
                ", mPosition=" + mPosition +
                ", mActions=" + mActions +
                ", mEvaluations=" + mEvaluations +
                ", mStatus=" + mStatus +
                ", mSupervisor=" + mSupervisor +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (SSN != null ? !SSN.equals(employee.SSN) : employee.SSN != null) return false;
        if (hireDate != null ? !hireDate.equals(employee.hireDate) : employee.hireDate != null) return false;
        if (mActor != null ? !mActor.equals(employee.mActor) : employee.mActor != null) return false;
        if (mDependents != null ? !mDependents.equals(employee.mDependents) : employee.mDependents != null)
            return false;
        if (mPosition != null ? !mPosition.equals(employee.mPosition) : employee.mPosition != null) return false;
        if (mActions != null ? !mActions.equals(employee.mActions) : employee.mActions != null) return false;
        if (mEvaluations != null ? !mEvaluations.equals(employee.mEvaluations) : employee.mEvaluations != null)
            return false;
        if (mStatus != employee.mStatus) return false;
        return mSupervisor != null ? mSupervisor.equals(employee.mSupervisor) : employee.mSupervisor == null;
    }

    @Override
    public int hashCode() {
        int result = SSN != null ? SSN.hashCode() : 0;
        result = 31 * result + (hireDate != null ? hireDate.hashCode() : 0);
        result = 31 * result + (mActor != null ? mActor.hashCode() : 0);
        result = 31 * result + (mDependents != null ? mDependents.hashCode() : 0);
        result = 31 * result + (mPosition != null ? mPosition.hashCode() : 0);
        result = 31 * result + (mActions != null ? mActions.hashCode() : 0);
        result = 31 * result + (mEvaluations != null ? mEvaluations.hashCode() : 0);
        result = 31 * result + (mStatus != null ? mStatus.hashCode() : 0);
        result = 31 * result + (mSupervisor != null ? mSupervisor.hashCode() : 0);
        return result;
    }

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