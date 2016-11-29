package EmployeeManagementPackage;

import java.util.*;

/**
 * @author Cobra
 */
public class Evaluation {
    public Evaluation(String content, Date begin, Date end, String soc, Grade mGrade) {
        this.content = content;
        this.begin = begin;
        this.end = end;
        this.soc = soc;
        this.mGrade = mGrade;
    }

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private Date begin;

    /**
     * 
     */
    private Date end;

    /**
     * 
     */
    private String soc;

    /**
     * 
     */
    private Grade mGrade;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getSoc() {
        return soc;
    }

    public void setSoc(String soc) {
        this.soc = soc;
    }

    public Grade getmGrade() {
        return mGrade;
    }

    public void setmGrade(Grade mGrade) {
        this.mGrade = mGrade;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "content='" + content + '\'' +
                ", begin=" + begin +
                ", end=" + end +
                ", soc='" + soc + '\'' +
                ", mGrade=" + mGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Evaluation that = (Evaluation) o;

        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (begin != null ? !begin.equals(that.begin) : that.begin != null) return false;
        if (end != null ? !end.equals(that.end) : that.end != null) return false;
        if (soc != null ? !soc.equals(that.soc) : that.soc != null) return false;
        return mGrade == that.mGrade;
    }

    @Override
    public int hashCode() {
        int result = content != null ? content.hashCode() : 0;
        result = 31 * result + (begin != null ? begin.hashCode() : 0);
        result = 31 * result + (end != null ? end.hashCode() : 0);
        result = 31 * result + (soc != null ? soc.hashCode() : 0);
        result = 31 * result + (mGrade != null ? mGrade.hashCode() : 0);
        return result;
    }
}