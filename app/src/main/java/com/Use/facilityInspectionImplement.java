package com.Use;

import com.Facility.facility;

public class facilityInspectionImplement implements facilityInspect
{
    private int inspectID;
    private int facilityID;
    private String inspect_type;
    private String inspect_detail;
    private facility facility;

    public facilityInspectionImplement() {}

    //getting and setting
    public facility getFacility() {
        return facility;
    }
    public void setFacility(facility facility) {
        this.facility = facility;
    }
    public int getFacilityID() {
        return facilityID;
    }
    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }
    public String getInspect_type() {
        return inspect_type;
    }
    public void setInspect_type(String inspect_type) {
        this.inspect_type = inspect_type;
    }
    public String getInspect_detail() {
        return inspect_detail;
    }
    public void setInspect_detail(String inspect_detail) {
        this.inspect_detail = inspect_detail;
    }
    public int getInspectID() {
        return inspectID;
    }
    public void setInspectID(int inspectID) {
        this.inspectID = inspectID;
    }

}
