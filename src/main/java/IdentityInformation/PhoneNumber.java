package IdentityInformation;

import java.util.*;

/**
 * @author Cobra
 */
public class PhoneNumber {

    public PhoneNumber(String areaCode, String countryCode, String extension) {
        this.areaCode = areaCode;
        this.countryCode = countryCode;
        this.extension = extension;
    }

    /**
     * 
     */
    private String areaCode;

    /**
     * 
     */
    private String countryCode;

    /**
     * 
     */
    private String extension;

}