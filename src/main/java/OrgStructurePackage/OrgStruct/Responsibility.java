package OrgStructurePackage.OrgStruct;

import java.util.*;

/**
 * @author Cobra
 */
public class Responsibility {


    public Responsibility(String description, List<Task> steps) {
        mDescription = description;
        mSteps = steps;
    }

    private String mDescription;
    private List<Task> mSteps;

    public String getDescription() {
        return mDescription;
    }

    public List<Task> getSteps() {
        return mSteps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Responsibility that = (Responsibility) o;

        if (!mDescription.equals(that.mDescription)) return false;
        return mSteps.equals(that.mSteps);

    }

    @Override
    public int hashCode() {
        int result = mDescription.hashCode();
        result = 31 * result + mSteps.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Responsibility{" +
                "mDescription='" + mDescription + '\'' +
                ", mSteps=" + mSteps +
                '}';
    }
}