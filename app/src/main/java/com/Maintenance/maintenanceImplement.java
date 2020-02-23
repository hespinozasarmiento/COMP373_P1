package com.Maintenance;

import com.fms.main.Facility;

public class maintenanceImplement implements maintenance
{
        private int maintenanceID;
        private int maintenanceRequestID;
        private int facilityID;
        private String maintenanceDetails;
        private int cost;
        private Facility facility;

        public MaintenanceImpl() {}

        //getting and setting
        public int getMaintenanceID() {
            return maintenanceID;
        }
        public void setMaintenanceID(int maintenanceID) {
            this.maintenanceID = maintenanceID;
        }
        public int getMaintenanceRequestID() {
            return maintenanceRequestID;
        }
        public void setMaintenanceRequestID(int maintenanceRequestID) {
            this.maintenanceRequestID = maintenanceRequestID;
        }
        public int getFacilityID() {
            return facilityID;
        }
        public void setFacilityID(int facilityID) {
            this.facilityID = facilityID;
        }
        public String getMaintenanceDetails() {
            return maintenanceDetails;
        }
        public void setMaintenanceDetails(String details) {
            this.maintenanceDetails = maintenanceDetails;
        }
        public int getCost() {
            return cost;
        }
        public void setCost(int cost) {
            this.cost = cost;
        }
        public Facility getFacility() {
            return facility;
        }
        public void setFacility(Facility facility) {
            this.facility = facility;
        }
}
