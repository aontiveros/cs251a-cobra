package personnel;

import java.util.*;

/**
 * @author Cobra
 */
public class Employee {

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
    private Person actor;

    /**
     * 
     */
    private Set<Person> dependents;

    /**
     * 
     */
    private Position position;

    /**
     * 
     */
    private Set<Action> actions;

    /**
     * 
     */
    private Set<Evaluation> evaluations;

    /**
     * 
     */
    private Status status;

    /**
     * 
     */
    private Manager supervisor;

    /**
     * @param note 
     * @param type
     */
    public void addAction(String note, ActionType type) {
        // TODO implement here
    }

}