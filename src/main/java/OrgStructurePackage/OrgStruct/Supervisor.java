package OrgStructurePackage.OrgStruct;

import EmployeeManagementPackage.Employee;
import EmployeeManagementPackage.Position;

import java.util.*;

/**
 * @author Cobra
 */
public class Supervisor extends Position {

    public Supervisor(HashSet<Position> directReports) {
        mDirectReports = directReports;
    }

    private Set<Position> mDirectReports;

    public Set<Position> getDirectReports() {
        return mDirectReports;
    }

    public void addDirectReport(Position pos) {
        mDirectReports.add(pos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Supervisor that = (Supervisor) o;

        return mDirectReports.equals(that.mDirectReports);

    }

    @Override
    public int hashCode() {
        return mDirectReports.hashCode();
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "mDirectReports=" + mDirectReports +
                '}';
    }
}