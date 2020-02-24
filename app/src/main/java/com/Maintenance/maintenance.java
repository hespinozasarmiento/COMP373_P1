package com.Maintenance;

import com.Facility.facility;

public interface maintenance
{

        //declaring getting and setting
        public facility getFacility();
        public void setFacility(facility facility);
        public int getFacilityID();
        public void setFacilityID(int facilityID);
        public int getCost();
        public void setCost(int cost);
        public String getMaintenanceDetails();
        public void setMaintenanceDetails(String maintenanceDetails);
        public int getMaintenanceID();
        public void setMaintenanceID(int maintenanceID);
        public int getMaintenanceRequestID();
        public void setMaintenanceRequestID(int maintenanceRequestID);
}