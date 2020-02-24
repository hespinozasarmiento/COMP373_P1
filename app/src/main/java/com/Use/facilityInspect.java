package com.Use;

import com.Facility.facility;

public interface facilityInspect
{
    //declaring getting and setting
    public facility getFacility();
    public void setFacility(facility facility);
    public int getFacilityID();
    public void setFacilityID(int facility_ID);
    public String getInspect_type();
    public void setInspect_type(String inspect_type);
    public String getInspect_detail();
    public void setInspect_detail(String inspect_detail);
    public int getInspectID();
    public void setInspectID(int inspectID);
}
