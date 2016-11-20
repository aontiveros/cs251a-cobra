package hrms.personnel;

import java.util.*;
import hrms.personal.*;

/**
 * @author Cobra
 */
public class Employee {

    private String SSN;
    private Date hireDate;
    private Person actor;
    private Set<Person> dependents;
    private Position position;
    private Set<Action> actions;
    private Set<Evaluation> evaluations;
    private Status status;
    private Manager supervisor;

    public Employee(String SSN, Date hireDate, Person actor, Position position, Status status, Manager supervisor) {
        this.SSN = SSN;
        this.hireDate = hireDate;
        this.actor = actor;
        this.dependents = new HashSet<>();
        this.position = position;
        this.actions = new HashSet<>();
        this.evaluations = new HashSet<>();
        this.status = status;
        this.supervisor = supervisor;
    }

    /**
     * Adds a new action for the respective employee
     * @param note Information regarding the action taken
     * @param type The type of action that was taken
     * @param date The date the action was taken
     */
    public void addAction(String note, ActionType type, Date date) {
        actions.add(new Action(note, date, type));
    }


    public void setDependents(Person dependent) {
        dependents.add(dependent);
    }

    public void setSupervisor(Manager supervisor) {
        this.supervisor = supervisor;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setActions(Set<Action> actions) {
        this.actions = actions;
    }

    public String getSSN() {
        return SSN;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public Person getActor() {
        return actor;
    }

    public Set<Person> getDependents() {
        return dependents;
    }

    public Position getPosition() {
        return position;
    }

    public Set<Action> getActions() {
        return actions;
    }

    public Set<Evaluation> getEvaluations() {
        return evaluations;
    }

    public Status getStatus() {
        return status;
    }

    public Manager getSupervisor() {
        return supervisor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getSSN() != null ? !getSSN().equals(employee.getSSN()) : employee.getSSN() != null) return false;
        if (getHireDate() != null ? !getHireDate().equals(employee.getHireDate()) : employee.getHireDate() != null)
            return false;
        if (getActor() != null ? !getActor().equals(employee.getActor()) : employee.getActor() != null) return false;
        if (getDependents() != null ? !getDependents().equals(employee.getDependents()) : employee.getDependents() != null)
            return false;
        if (getPosition() != null ? !getPosition().equals(employee.getPosition()) : employee.getPosition() != null)
            return false;
        if (getActions() != null ? !getActions().equals(employee.getActions()) : employee.getActions() != null)
            return false;
        if (getEvaluations() != null ? !getEvaluations().equals(employee.getEvaluations()) : employee.getEvaluations() != null)
            return false;
        if (getStatus() != employee.getStatus()) return false;
        return getSupervisor() != null ? getSupervisor().equals(employee.getSupervisor()) : employee.getSupervisor() == null;

    }

    @Override
    public int hashCode() {
        int result = getSSN() != null ? getSSN().hashCode() : 0;
        result = 31 * result + (getHireDate() != null ? getHireDate().hashCode() : 0);
        result = 31 * result + (getActor() != null ? getActor().hashCode() : 0);
        result = 31 * result + (getDependents() != null ? getDependents().hashCode() : 0);
        result = 31 * result + (getPosition() != null ? getPosition().hashCode() : 0);
        result = 31 * result + (getActions() != null ? getActions().hashCode() : 0);
        result = 31 * result + (getEvaluations() != null ? getEvaluations().hashCode() : 0);
        result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
        result = 31 * result + (getSupervisor() != null ? getSupervisor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "SSN='" + SSN + '\'' +
                ", hireDate=" + hireDate +
                ", actor=" + actor +
                ", dependents=" + dependents +
                ", position=" + position +
                ", actions=" + actions +
                ", evaluations=" + evaluations +
                ", status=" + status +
                ", supervisor=" + supervisor +
                ", person=" + super.toString() +
                '}';
    }
}