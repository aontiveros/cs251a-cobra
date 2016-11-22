package hrms.personnel;

import java.util.*;

/**
 * @author Cobra
 */
public class Evaluation {

    private String content;
    private Date begin;
    private Date end;
    private Grade grade;

    public Evaluation(String content, Date begin, Date end, Grade grade) {
        this.content = content;
        this.begin = begin;
        this.end = end;
        this.grade = grade;
    }

    public String getContent() {
        return content;
    }

    public Date getBegin() {
        return begin;
    }

    public Date getEnd() {
        return end;
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "content='" + content + '\'' +
                ", begin=" + begin +
                ", end=" + end +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evaluation)) return false;

        Evaluation that = (Evaluation) o;

        if (getContent() != null ? !getContent().equals(that.getContent()) : that.getContent() != null) return false;
        if (getBegin() != null ? !getBegin().equals(that.getBegin()) : that.getBegin() != null) return false;
        if (getEnd() != null ? !getEnd().equals(that.getEnd()) : that.getEnd() != null) return false;
        return getGrade() == that.getGrade();

    }

    @Override
    public int hashCode() {
        int result = getContent() != null ? getContent().hashCode() : 0;
        result = 31 * result + (getBegin() != null ? getBegin().hashCode() : 0);
        result = 31 * result + (getEnd() != null ? getEnd().hashCode() : 0);
        result = 31 * result + (getGrade() != null ? getGrade().hashCode() : 0);
        return result;
    }
}