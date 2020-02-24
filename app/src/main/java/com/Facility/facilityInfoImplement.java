package com.Facility;

public class facilityInfoImplement implements facilityInfo
{
    private String name;
    private int facilityID;
    private String location;
    private int numberOfRooms;
    private long phoneNumber;
    private facility facility;

    public facilityInfoImplement() {}

    //getting and setting
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getFacilityID() {
        return facilityID;
    }
    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public String getLocation(){ return location; }
    public void setLocation(String location){ this.location = location; }
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public facility getfacility() {
        return facility;
    }
    public void setfacility(facility facility) {
        this.facility = facility;
    }
}
