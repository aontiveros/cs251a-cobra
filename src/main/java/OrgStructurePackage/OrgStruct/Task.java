package OrgStructurePackage.OrgStruct;

import java.util.*;

/**
 * @author Cobra
 */
public class Task {

    public Task(String description, Date dueDate) {
        mDescription = description;
        mDueDate = dueDate;
    }

    private String mDescription;
    private Date mDueDate;

    public void setDueDate(Date dueDate) {
        mDueDate = dueDate;
    }

    public String getDescription() {
        return mDescription;
    }

    public Date getDueDate() {
        return mDueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (!mDescription.equals(task.mDescription)) return false;
        return mDueDate.equals(task.mDueDate);

    }

    @Override
    public int hashCode() {
        int result = mDescription.hashCode();
        result = 31 * result + mDueDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Task{" +
                "mDescription='" + mDescription + '\'' +
                ", mDueDate=" + mDueDate +
                '}';
    }
}