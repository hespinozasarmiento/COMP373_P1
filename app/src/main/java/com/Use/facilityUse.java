package com.Use;

import com.Facility.facility;
import java.time.LocalDate;

public interface facilityUse
{
    //declaring getting and setting
    public void setFacility(facility facility);
    public facility getFacility();
    public int getUseID();
    public void setUseID(int useID);
    public int getFacilityID();
    public void setFacilityID(int facilityID);
    public int getRoomNumber();
    public void setRoomNumber(int roomNumber);
    public LocalDate getStartDate();
    public void setStartDate(LocalDate startDate);
    public LocalDate getEndDate();
    public void setEndDate(LocalDate endDate);
}
