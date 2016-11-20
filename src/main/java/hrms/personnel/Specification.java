package hrms.personnel;

import java.util.*;

/**
 * @author Cobra
 */
public class Specification {

    private String responsibility;

    public Specification(String responsibility) {
        this.responsibility = responsibility;
    }

    public String getResponsibility() {
        return responsibility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Specification)) return false;

        Specification that = (Specification) o;

        return getResponsibility() != null ? getResponsibility().equals(that.getResponsibility()) : that.getResponsibility() == null;

    }

    @Override
    public int hashCode() {
        return getResponsibility() != null ? getResponsibility().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "responsibility='" + responsibility + '\'' +
                '}';
    }
}