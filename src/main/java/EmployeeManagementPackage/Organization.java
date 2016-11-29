package EmployeeManagementPackage;

import java.util.*;

/**
 * @author Cobra
 */
public class Organization implements Actor {

    public Organization(String name) {
        this.name = name;
    }
    /**
     * 
     */
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Organization that = (Organization) o;

        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}