package hrms.personal;

import java.util.*;

/**
 * @author Cobra
 */
public class PhoneNumber {

    private String areaCode;
    private String countryCode;
    private String extension;

    public PhoneNumber(String areaCode, String countryCode, String extension) {
        this.areaCode = areaCode;
        this.countryCode = countryCode;
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode='" + areaCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumber)) return false;

        PhoneNumber that = (PhoneNumber) o;

        if (getAreaCode() != null ? !getAreaCode().equals(that.getAreaCode()) : that.getAreaCode() != null)
            return false;
        if (getCountryCode() != null ? !getCountryCode().equals(that.getCountryCode()) : that.getCountryCode() != null)
            return false;
        return getExtension() != null ? getExtension().equals(that.getExtension()) : that.getExtension() == null;

    }

    @Override
    public int hashCode() {
        int result = getAreaCode() != null ? getAreaCode().hashCode() : 0;
        result = 31 * result + (getCountryCode() != null ? getCountryCode().hashCode() : 0);
        result = 31 * result + (getExtension() != null ? getExtension().hashCode() : 0);
        return result;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getExtension() {
        return extension;
    }
}