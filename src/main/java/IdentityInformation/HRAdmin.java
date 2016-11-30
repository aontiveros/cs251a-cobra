package IdentityInformation;

import java.util.*;
import EmployeeManagementPackage.*;
import EmployeeManagementPackage.Manager;
import OrgStructurePackage.OrgStruct.*;
import PayrollPackage.Payroll.*;
import hrms.system.HRMS;

/**
 * @author Cobra
 */
public class HRAdmin extends Employee {

    public HRAdmin(String SSN, Date hireDate, Person mActor, Set<Person> mDependents, Position mPosition, Set<Action> mActions, Set<Evaluation> mEvaluations, Status mStatus, Manager mSupervisor) {
        super(SSN, hireDate, mActor, mDependents, mPosition, mActions, mEvaluations, mStatus, mSupervisor);
    }

    public HRAdmin(String SSN, Date hireDate, Person mActor, Set<Person> mDependents, Position mPosition, Manager mSupervisor) {
        super(SSN, hireDate, mActor, mDependents, mPosition, mSupervisor);
    }

    @Override
    public String toString(){
        return super.toString();
    }
    /**
     * 
     */
    public void createActionOnRecord() throws Exception {
        System.out.print("What is the action type? ( ");
        for(ActionType type : ActionType.values()){
            System.out.print(" " + type + ",");
        }
        System.out.println(")");
        String typer = HRMS.in.nextLine();
        ActionType selected = null;
        for(ActionType type : ActionType.values()){
            if(type.toString().equals(typer))
                selected = type;
        }
        if(selected == null)
            throw new Exception("Must Select a valid type!");
        System.out.println("What is the action notes? ");
        String notes = HRMS.in.nextLine();
        Action action = new Action(notes, new GregorianCalendar().getTime(), selected);
        System.out.println("Created Action");

    }

    /**
     * @return
     */
    public OrgChart createOrgChart() {
        HRMS.addOrganizationalUnit();
        return OrgChart.getOrgChart();
    }

    /**
     * @param orgChart 
     * @return
     */
    public OrgChart updateOrgChart(OrgChart orgChart) {
        HRMS.addOrganizationalUnit();
        return OrgChart.getOrgChart();
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
        employee.setPosition(pos);
        employee.addAction(new Action("Assigned a new position", new GregorianCalendar().getTime(), ActionType.PROMOTED));
    }

    /**
     * @param employee
     */
    public void unAssignPosition(Employee employee) {
        HRMS.addPositions();
    }

    /**
     * 
     */
    public void createOrgUnit() {
        HRMS.addOrganizationalUnit(); //placeholder
    }

    /**
     * 
     */
    public void dissolveOrgUnit() {
        HRMS.addOrganizationalUnit(); //placeholder
    }

    public void issueBulkPayment() {
        System.out.println("Issuing bulk payment");
        BulkPayment bulkPayment = new BulkPayment();
        bulkPayment.sendPayment();
    }

    public void issueIndividualPayment(double amount, Set<Employee> listOfEmployees, PaymentTypes payType) {

        System.out.println("Issuing individual payment");
        IndividualPayment individualPayment = new IndividualPayment(amount, listOfEmployees, payType);
        individualPayment.sendPayment();
    }

    /**
     * @param mOrgUnit1 
     * @param mOrgUnit2
     */
    public void changeUnitHierachy(OrgUnit mOrgUnit1, OrgUnit mOrgUnit2) {
        // TODO implement here
        OrgUnitHead newHead = new OrgUnitHead(UnitHeadType.CHAIR);
        mOrgUnit1.setUnitHead(newHead);
    }

    /**
     * 
     */
    public void createPosition() {
        // TODO implement here
        Scanner in = new Scanner(System.in);
        System.out.println("What is the title of the positon?");
        String posTitle  = in.nextLine();
        Position newPosition = new Position(posTitle);
        System.out.println("Position Created");
    }

    /**
     * @param pos
     */
    public void updatePosition(Position pos) {
        // TODO implement here
        Scanner in = new Scanner(System.in);
        System.out.println("What is the new title of the positon?");
        String posTitle  = in.nextLine();
        pos.setTitle(posTitle);
        System.out.println("Position Created");
    }

}