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
    public facility getFacility() {
        return facility;
    }
    public void setFacility(facility facility) {
        this.facility = facility;
    }


    //Overrode this to get it to work-will need to figure it out
    @Override
    public com.Facility.facility facility() {
        // TODO Auto-generated method stub
        return null;
    }
}
