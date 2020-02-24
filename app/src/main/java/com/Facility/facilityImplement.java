package com.Facility;

public class facilityImplement implements facility
{
    private int facilityID;
    private facilityInfo facilityInfo;

    public facilityImplement() {}

    //getters and setters
    public facilityInfo getFacilityDetail() {
        return facilityInfo;
    }
    public void setFacilityInfo(facilityInfo facilityInfo) {
        this.facilityInfo = facilityInfo;
    }
    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }
    public int getFacilityID() {
        return facilityID;
    }
}