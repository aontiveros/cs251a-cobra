package IdentityInformation;

import java.util.*;
import EmployeeManagementPackage.*;
import hrms.system.HRMS;

/**
 * @author Cobra
 */
public class Guest {

    public Guest() {
    }


    /**
     * @return
     */
    public ArrayList<Position> viewJobListings() {
        ArrayList<Position> rList = new ArrayList<>();
        for(String pos : HRMS.sPositions.keySet()){
            rList.add(HRMS.sPositions.get(pos));
        }
        return rList;
    }

    /**
     * 
     */
    public void logIn() {
        System.out.println("You have logged in!");

    }

    /**
     * 
     */
    public void logOut() {
        System.out.println("You have logged out");
    }

    /**
     * 
     */
    public void viewOrgChart() {
        HRMS.viewOrganizationalUnits();
    }

}