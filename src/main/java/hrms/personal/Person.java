package hrms.personal;

import java.util.*;

/**
 * @author Cobra
 */
public class Person {

    private String name;
    private Date dob;
    private Address address;
    private PhoneNumber workNumber,homeNumber,cellNumber;
    private Gender gender;

    public Person(String name, Date dob, Address address, PhoneNumber workNumber, PhoneNumber homeNumber, PhoneNumber cellNumber, Gender gender){
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.workNumber = workNumber;
        this.homeNumber = homeNumber;
        this.cellNumber = cellNumber;
        this.gender = gender;
    }

    @Override
    public String
    toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                ", workNumber=" + workNumber +
                ", homeNumber=" + homeNumber +
                ", cellNumber=" + cellNumber +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getName() != null ? !getName().equals(person.getName()) : person.getName() != null) return false;
        if (getDob() != null ? !getDob().equals(person.getDob()) : person.getDob() != null) return false;
        if (getAddress() != null ? !getAddress().equals(person.getAddress()) : person.getAddress() != null)
            return false;
        if (getWorkNumber() != null ? !getWorkNumber().equals(person.getWorkNumber()) : person.getWorkNumber() != null)
            return false;
        if (getHomeNumber() != null ? !getHomeNumber().equals(person.getHomeNumber()) : person.getHomeNumber() != null)
            return false;
        if (getCellNumber() != null ? !getCellNumber().equals(person.getCellNumber()) : person.getCellNumber() != null)
            return false;
        return getGender() == person.getGender();

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getDob() != null ? getDob().hashCode() : 0);
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + (getWorkNumber() != null ? getWorkNumber().hashCode() : 0);
        result = 31 * result + (getHomeNumber() != null ? getHomeNumber().hashCode() : 0);
        result = 31 * result + (getCellNumber() != null ? getCellNumber().hashCode() : 0);
        result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getWorkNumber() {
        return workNumber;
    }

    public PhoneNumber getHomeNumber() {
        return homeNumber;
    }

    public PhoneNumber getCellNumber() {
        return cellNumber;
    }

    public Gender getGender() {
        return gender;
    }
}