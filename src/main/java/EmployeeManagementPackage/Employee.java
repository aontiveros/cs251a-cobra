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
        this.mSSN = SSN;
        this.mHireDate = hireDate;
        this.mActor = mActor;
        this.mDependents = mDependents;
        this.mPosition = mPosition;
        this.mActions = mActions;
        this.mEvaluations = mEvaluations;
        this.mStatus = mStatus;
        this.mSupervisor = mSupervisor;
    }

    /**
     * 
     */
    private String mSSN;

    /**
     * 
     */
    private Date mHireDate;

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

    public void addAction(Action newAction){
        mActions.add(newAction);
    }

    public void addDependent(Person dependent){
        mDependents.add(dependent);
    }

    public void addEvaluations(Evaluation  newEvaluation){
        mEvaluations.add(newEvaluation);
    }

    public void setPosition(Position newPosition){
        mPosition = newPosition;
    }


    public String getSSN() {
        return mSSN;
    }

    public Date getHireDate() {
        return mHireDate;
    }

    public Person getActor() {
        return mActor;
    }

    public Set<Person> getDependents() {
        return mDependents;
    }

    public Position getPosition() {
        return mPosition;
    }

    public Set<Action> getActions() {
        return mActions;
    }

    public Set<Evaluation> getEvaluations() {
        return mEvaluations;
    }

    public Status getStatus() {
        return mStatus;
    }

    public Manager getSupervisor() {
        return mSupervisor;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "mSSN='" + mSSN + '\'' +
                ", mHireDate=" + mHireDate +
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

        if (mSSN != null ? !mSSN.equals(employee.mSSN) : employee.mSSN != null) return false;
        if (mHireDate != null ? !mHireDate.equals(employee.mHireDate) : employee.mHireDate != null) return false;
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
        int result = mSSN != null ? mSSN.hashCode() : 0;
        result = 31 * result + (mHireDate != null ? mHireDate.hashCode() : 0);
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