package EmployeeManagementPackage;

import java.util.*;

/**
 * @author Cobra
 */
public class EmployeeRepository {

    private Set<Employee> employees;
    /**
     * Default constructor
     */
    public EmployeeRepository() {
        employees = new HashSet<>();
    }


    public Set<Employee> read() {
        return employees;
    }

    /**
     * @param e
     */
    public void write(Employee e) {
       employees.add(e);
    }

    /**
     * @param e
     */
    public void archieve(Employee e) {
        employees.remove(e);
    }

}