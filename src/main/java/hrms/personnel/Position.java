package hrms.personnel;

import java.util.*;

/**
 * @author Cobra
 */
public class Position {

    private String title;
    private String soc;
    private PayScale salary;
    private Specification specification;
    private Position supervisory;

    public Position(String title, String soc, PayScale salary, Specification specification, Position supervisory) {
        this.title = title;
        this.soc = soc;
        this.salary = salary;
        this.specification = specification;
        this.supervisory = supervisory;
    }

    public String getTitle() {
        return title;
    }

    public String getSoc() {
        return soc;
    }

    public PayScale getSalary() {
        return salary;
    }

    public Specification getSpecification() {
        return specification;
    }

    public Position getSupervisory() {
        return supervisory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;

        Position position = (Position) o;

        if (title != null ? !title.equals(position.title) : position.title != null) return false;
        if (soc != null ? !soc.equals(position.soc) : position.soc != null) return false;
        if (salary != null ? !salary.equals(position.salary) : position.salary != null) return false;
        if (specification != null ? !specification.equals(position.specification) : position.specification != null)
            return false;
        return supervisory != null ? supervisory.equals(position.supervisory) : position.supervisory == null;

    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (soc != null ? soc.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (specification != null ? specification.hashCode() : 0);
        result = 31 * result + (supervisory != null ? supervisory.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Position{" +
                "title='" + title + '\'' +
                ", soc='" + soc + '\'' +
                ", salary=" + salary +
                ", specification=" + specification +
                ", supervisory=" + supervisory +
                '}';
    }
}