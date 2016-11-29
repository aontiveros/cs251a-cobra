
import java.util.*;

/**
 * @author Cobra
 */
public class Person implements Actor {

    /**
     * Default constructor
     */
    public Person() {
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Date dob;

    /**
     * 
     */
    private Gender mGender;

    /**
     * 
     */
    private Adress mAddress;

    /**
     * 
     */
    private PhoneNumber[] mWorkNumber,mHomeNumber,mCellNumber;

    /**
     * 
     */
    private Ethnicity mEthnicity;

    /**
     * 
     */
    private Set<Disability> mDisabilities;

    /**
     * 
     */
    private Email mEmail;

}