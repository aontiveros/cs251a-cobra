package hrms.personnel;

import java.util.*;

/**
 * @author Cobra
 */
public class Action {

    private String note;
    private Date date;
    private ActionType type;

    public Action(String note, Date date, ActionType type) {
        this.note = note;
        this.date = date;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Action{" +
                "note='" + note + '\'' +
                ", date=" + date +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Action)) return false;

        Action action = (Action) o;

        if (note != null ? !note.equals(action.note) : action.note != null) return false;
        if (date != null ? !date.equals(action.date) : action.date != null) return false;
        return type == action.type;

    }

    @Override
    public int hashCode() {
        int result = note != null ? note.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    public String getNote() {
        return note;
    }

    public Date getDate() {
        return date;
    }

    public ActionType getType() {
        return type;
    }
}