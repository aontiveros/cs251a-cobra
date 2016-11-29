package EmployeeManagementPackage;

import IdentityInformation.Person;

import java.util.*;

/**
 * @author Cobra
 */
public class Manager extends Employee {

    public Manager(String SSN, Date hireDate, Person mActor, Set<Person> mDependents, Position mPosition, Set<Action> mActions, Set<Evaluation> mEvaluations, Status mStatus, Manager mSupervisor, Set<Employee> mManaging) {
        super(SSN, hireDate, mActor, mDependents, mPosition, mActions, mEvaluations, mStatus, mSupervisor);
        this.mManaging = mManaging;
    }

    public Set<Employee> getmManaging() {

        return mManaging;
    }

    public void addEmployee(Employee mManaging) {
        this.mManaging.add(mManaging);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "mManaging=" + mManaging +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Manager manager = (Manager) o;

        return mManaging != null ? mManaging.equals(manager.mManaging) : manager.mManaging == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (mManaging != null ? mManaging.hashCode() : 0);
        return result;
    }

    /**
     * 
     */
    private Set<Employee> mManaging;

    /**
     * @param employee 
     * @param being 
     * @param end 
     * @param content 
     * @param grade
     */
    public void witeEvaluation(Employee employee, Date being, Date end, String content, Grade grade) {
        // TODO implement here
    }

    /**
     * @param employee 
     * @param action
     */
    public void performAction(Employee employee, Action action) {
        // TODO implement here
    }

}