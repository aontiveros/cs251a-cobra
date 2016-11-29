package IdentityInformation;

import EmployeeManagementPackage.Position;

import java.util.Date;

/**
 * Created by SamO on 11/28/16.
 */
public class Application {

    public Application(Date timeSubmitted, Position opening, ApplicationStatusType status) {
        mTimeSubmitted = timeSubmitted;
        mOpening = opening;
        mStatus = status;
    }

    private Date mTimeSubmitted;
    private Position mOpening;
    private ApplicationStatusType mStatus;

    public Date getTimeSubmitted() {
        return mTimeSubmitted;
    }

    public Position getOpening() {
        return mOpening;
    }

    public ApplicationStatusType getStatus() {
        return mStatus;
    }

    public void setStatus(ApplicationStatusType status) {
        mStatus = status;
    }


}
