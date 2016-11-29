package IdentityInformation;

import java.util.*;

/**
 * @author Cobra
 */
public class Address {

    public Address(int streetNumber, String streetName, String city, String state, int zipcode) {
        mStreetNumber = streetNumber;
        mStreetName = streetName;
        mCity = city;
        mState = state;
        mZipcode = zipcode;
        mCountryCode = 1; // default for United States
    }

    public Address(int streetNumber, String streetName, String city, String state, int zipcode, int aptNumber, int countryCode) {
        mStreetNumber = streetNumber;
        mStreetName = streetName;
        mCity = city;
        mState = state;
        mZipcode = zipcode;
        mAptNumber = aptNumber;
        mCountryCode = countryCode;
    }

    private int mStreetNumber;
    private String mStreetName;
    private String mCity;
    private String mState;
    private int mZipcode;
    private int mAptNumber;
    private int mCountryCode;

    public int getStreetNumber() {
        return mStreetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        mStreetNumber = streetNumber;
    }

    public String getStreetName() {
        return mStreetName;
    }

    public void setStreetName(String streetName) {
        mStreetName = streetName;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public int getZipcode() {
        return mZipcode;
    }

    public void setZipcode(int zipcode) {
        mZipcode = zipcode;
    }

    public int getAptNumber() {
        return mAptNumber;
    }

    public void setAptNumber(int aptNumber) {
        mAptNumber = aptNumber;
    }

    public int getCountryCode() {
        return mCountryCode;
    }

    public void setCountryCode(int countryCode) {
        mCountryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (mStreetNumber != address.mStreetNumber) return false;
        if (mZipcode != address.mZipcode) return false;
        if (mAptNumber != address.mAptNumber) return false;
        if (mCountryCode != address.mCountryCode) return false;
        if (!mStreetName.equals(address.mStreetName)) return false;
        if (!mCity.equals(address.mCity)) return false;
        return mState.equals(address.mState);

    }

    @Override
    public int hashCode() {
        int result = mStreetNumber;
        result = 31 * result + mStreetName.hashCode();
        result = 31 * result + mCity.hashCode();
        result = 31 * result + mState.hashCode();
        result = 31 * result + mZipcode;
        result = 31 * result + mAptNumber;
        result = 31 * result + mCountryCode;
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "mStreetNumber=" + mStreetNumber +
                ", mStreetName='" + mStreetName + '\'' +
                ", mCity='" + mCity + '\'' +
                ", mState='" + mState + '\'' +
                ", mZipcode=" + mZipcode +
                ", mAptNumber=" + mAptNumber +
                ", mCountryCode=" + mCountryCode +
                '}';
    }
}