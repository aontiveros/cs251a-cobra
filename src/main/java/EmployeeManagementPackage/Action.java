package EmployeeManagementPackage;

import java.util.*;

/**
 * @author Cobra
 */
public class Action {

    public Action(String note, Date date, ActionType mActionType) {
        this.note = note;
        this.date = date;
        this.mActionType = mActionType;
    }

    /**
     * 
     */
    private String note;

    /**
     * 
     */
    private Date date;

    /**
     * 
     */
    private ActionType mActionType;

}