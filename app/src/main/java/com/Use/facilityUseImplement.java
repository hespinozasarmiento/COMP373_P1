package com.Use;

import com.Facility.facility;
import java.time.LocalDate;

public class facilityUseImplement implements facilityUse{
    private int useID;
    private int facilityID;
    private int roomNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private facility facility;

    public facilityUseImplement() {}

    public facility getfacility() {
        return facility;
    }
    public void setfacility(facility facility) {
        this.facility = facility;
    }
    public int getUseID() {
        return useID;
    }
    public void setUseID(int useID) {
        this.useID = useID;
    }
    public int getFacilityID() {
        return facilityID;
    }
    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}