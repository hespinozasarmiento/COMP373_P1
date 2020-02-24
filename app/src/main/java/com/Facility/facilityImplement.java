package com.Facility;

public class facilityImplement implements facility
{
    private int facilityID;
    private facilityInfo facilityInfo;

    //public FacilityImpl() {}

    //getters and setters
    public facilityInfo getfacilityInfo() {
        return facilityInfo;
    }
    public void setfacilityInfo(facilityInfo facilityInfo) {
        this.facilityInfo = facilityInfo;
    }
    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }
    public int getFacilityID() {
        return facilityID;
    }
}