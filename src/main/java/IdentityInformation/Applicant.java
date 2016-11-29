package IdentityInformation;

import java.util.*;

/**
 * @author Cobra
 */
public class Applicant extends Guest {

    public Applicant() {
        mApplications = new HashSet<>();
    }

    private Set<Application> mApplications;

    /**
     * @param app
     */
    public void submitApplication(Application app) {
        // TODO implement here
        mApplications.add(app);
    }

    /**
     * @param app
     */
    public void checkApplicationStatus(Application app) {
        // TODO implement here
        System.out.println(app.toString());
    }

}