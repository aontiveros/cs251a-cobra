package IdentityInformation;

/**
 * @author Cobra
 */
public class PhoneNumber {

    public PhoneNumber(String areaCode, String countryCode, String extension) {
        this.mAreaCode = areaCode;
        this.mCountryCode = countryCode;
        this.mExtension = extension;
    }

    /**
     * 
     */
    private String mAreaCode;

    /**
     * 
     */
    private String mCountryCode;

    /**
     * 
     */
    private String mExtension;

    public String getAreaCode() {
        return mAreaCode;
    }

    public String getCountryCode() {
        return mCountryCode;
    }

    public String getExtension() {
        return mExtension;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "mAreaCode='" + mAreaCode + '\'' +
                ", mCountryCode='" + mCountryCode + '\'' +
                ", mExtension='" + mExtension + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneNumber that = (PhoneNumber) o;

        if (mAreaCode != null ? !mAreaCode.equals(that.mAreaCode) : that.mAreaCode != null) return false;
        if (mCountryCode != null ? !mCountryCode.equals(that.mCountryCode) : that.mCountryCode != null) return false;
        return mExtension != null ? mExtension.equals(that.mExtension) : that.mExtension == null;
    }

    @Override
    public int hashCode() {
        int result = mAreaCode != null ? mAreaCode.hashCode() : 0;
        result = 31 * result + (mCountryCode != null ? mCountryCode.hashCode() : 0);
        result = 31 * result + (mExtension != null ? mExtension.hashCode() : 0);
        return result;
    }
}