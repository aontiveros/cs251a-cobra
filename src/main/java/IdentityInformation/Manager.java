package IdentityInformation;

import java.util.*;

import EmployeeManagementPackage.*;
import OrgStructurePackage.OrgStruct.OrgUnit;


/**
 * @author Cobra
 */
public class Manager extends Employee {

    public Manager(String SSN, Date hireDate, Person mActor, Set<Person> mDependents, Position mPosition, Set<Action> mActions, Set<Evaluation> mEvaluations, Status mStatus, EmployeeManagementPackage.Manager mSupervisor) {
        super(SSN, hireDate, mActor, mDependents, mPosition, mActions, mEvaluations, mStatus, mSupervisor);
    }

    /**
     * @param employee 
     * @param mOrgUnit
     */
    public void transferEmployee(Employee employee, OrgUnit mOrgUnit) {
        // TODO implement here
    }

}