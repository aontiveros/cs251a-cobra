package OrgStructurePackage.OrgStruct;

import java.util.*;

/**
 * @author Cobra
 */
public class Specification {

    public Specification(Set<Task> tasks, Set<Responsibility> responsibilities) {
        mTasks = tasks;
        mResponsibilities = responsibilities;
    }

    private Set<Task> mTasks;
    private Set<Responsibility> mResponsibilities;

    public Set<Task> getTasks() {
        return mTasks;
    }

    public Set<Responsibility> getResponsibilities() {
        return mResponsibilities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Specification that = (Specification) o;

        if (!mTasks.equals(that.mTasks)) return false;
        return mResponsibilities.equals(that.mResponsibilities);

    }

    @Override
    public int hashCode() {
        int result = mTasks.hashCode();
        result = 31 * result + mResponsibilities.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "mTasks=" + mTasks +
                ", mResponsibilities=" + mResponsibilities +
                '}';
    }
}