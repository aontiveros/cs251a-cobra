package IdentityInformation;

import java.util.*;

/**
 * @author Cobra
 */
public class Email {

    public Email(String userName) {
        mUserName = userName;
    }

    private String mUserName;

    /**
     * 
     */
    private static String mOrgDomain = "Company";

    public String getUserName() {
        return mUserName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;

        return mUserName.equals(email.mUserName);

    }

    @Override
    public int hashCode() {
        return mUserName.hashCode();
    }

    @Override
    public String toString() {
        return "Email{" +
                mUserName + '@' + mOrgDomain + ".com" + "\'" +
                '}';
    }
}