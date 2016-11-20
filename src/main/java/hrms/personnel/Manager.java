package hrms.personnel;

import hrms.personal.Person;

import java.util.*;

/**
 * @author Cobra
 */
public class Manager extends Employee {

    private Set<Employee> managing;

    public Manager(String SSN, Date hireDate, Person actor, Position position, Status status, Manager supervisor) {
        super(SSN, hireDate, actor, position, status, supervisor);
        this.managing = new HashSet<>();
    }

    public Set<Employee> getManaging() {
        return managing;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managing=" + managing +
                ", employee=" + super.toString() +
                '}';
    }

    /** Write an evaluation for the respective employee that the manage supervises
     * @param employee The employee the evaluation is for
     * @param begin The beginning date of the evaluation period
     * @param end The end date of the evaluation persion
     * @param content The content regarding the evaluation
     * @param grade The grade provided for the employee
     */
    public void witeEvaluation(Employee employee, Date begin, Date end, String content, Grade grade) {

        if(managing.contains(employee)){
            // TODO Add the evaluation to the employee
        }
        else{
            throw new IllegalArgumentException("The employee, " + employee.getActor().getName() +
                    " is not supervised by " + this.getActor().getName());
        }
    }

}