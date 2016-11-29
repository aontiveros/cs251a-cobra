package IdentityInformation;

import java.util.*;
import EmployeeManagementPackage.*;
import EmployeeManagementPackage.Manager;
import OrgStructurePackage.OrgStruct.*;
import PayrollPackage.Payroll.*;

/**
 * @author Cobra
 */
public class HRAdmin extends Employee {

    public HRAdmin(String SSN, Date hireDate, Person mActor, Set<Person> mDependents, Position mPosition, Set<Action> mActions, Set<Evaluation> mEvaluations, Status mStatus, Manager mSupervisor) {
        super(SSN, hireDate, mActor, mDependents, mPosition, mActions, mEvaluations, mStatus, mSupervisor);
    }

    @Override
    public String toString(){
        return super.toString();
    }
    /**
     * 
     */
    public void createActionOnRecord() {
        // TODO implement here
    }

    /**
     * @return
     */
    public OrgChart createOrgChart() {
        // TODO implement here
        return null;
    }

    /**
     * @param orgChart 
     * @return
     */
    public OrgChart updateOrgChart(OrgChart orgChart) {
        // TODO implement here
        return null;
    }

    /**
     * @param head
     */
    public void setUnitHead(OrgUnitHead head) {
        // TODO implement here
    }

    /**
     * @param pos 
     * @param employee
     */
    public void assignPosition(Position pos, Employee employee) {
        // TODO implement here
    }

    /**
     * @param employee
     */
    public void unAssignPosition(Employee employee) {
        // TODO implement here
    }

    /**
     * 
     */
    public void createOrgUnit() {
        // TODO implement here
    }

    /**
     * 
     */
    public void dissolveOrgUnit() {
        // TODO implement here
    }

    /**
     * @param payment
     */
    public void issuePayment(Payment payment) {
        // TODO implement here
    }

    /**
     * @param mOrgUnit1 
     * @param mOrgUnit2
     */
    public void changeUnitHierachy(OrgUnit mOrgUnit1, OrgUnit mOrgUnit2) {
        // TODO implement here
    }

    /**
     * 
     */
    public void createPosition() {
        // TODO implement here
    }

    /**
     * @param pos
     */
    public void updatePosition(Position pos) {
        // TODO implement here
    }

}