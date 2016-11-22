package hrms.personal;

/**
 * @author Cobra
 */
public class Address {

    private String street;
    private String city;
    private String state;

    private int zipcode;
    private int aptNumber;
    private int streetNumber;

    /**
     * Basic Constructor for each attribute in part of an address
     * @param street
     * @param city
     * @param state
     * @param zipcode
     * @param aptNumber
     * @param streetNumber
     */
    public Address(String street, String city, String state, int zipcode, int aptNumber, int streetNumber) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.aptNumber = aptNumber;
        this.streetNumber = streetNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public int getAptNumber() {
        return aptNumber;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (getZipcode() != address.getZipcode()) return false;
        if (getAptNumber() != address.getAptNumber()) return false;
        if (getStreetNumber() != address.getStreetNumber()) return false;
        if (getStreet() != null ? !getStreet().equals(address.getStreet()) : address.getStreet() != null) return false;
        if (getCity() != null ? !getCity().equals(address.getCity()) : address.getCity() != null) return false;
        return getState() != null ? getState().equals(address.getState()) : address.getState() == null;

    }

    @Override
    public int hashCode() {
        int result = getStreet() != null ? getStreet().hashCode() : 0;
        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
        result = 31 * result + (getState() != null ? getState().hashCode() : 0);
        result = 31 * result + getZipcode();
        result = 31 * result + getAptNumber();
        result = 31 * result + getStreetNumber();
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                ", aptNumber=" + aptNumber +
                ", streetNumber=" + streetNumber +
                '}';
    }
}