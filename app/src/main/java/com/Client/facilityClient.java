package com.Client;

import java.util.List;
import com.Facility.*;
import com.Service.*;

public class facilityClient
{
        public facilityClient() throws Exception {

        serviceFacility serviceFacility = new serviceFacility();

        /**
         * Adding office locations for facilities.
         */

        //office1
        Facility office1 = new FacilityImpl();
        FacilityDetails office1Details = new FacilityDetailsImpl();
        office1.setFacilityID(1);
        office1Details.setName("Anissa Corporations");
        office1Details.setLocation("Chicago, IL");
        office1Details.setNumberOfRooms(10);
        office1.setFacilityDetail(office1Details);

        //office2
        Facility office2 = new FacilityImpl();
        FacilityDetails office2Details = new FacilityDetailsImpl();
        office2.setFacilityID(2);
        office2Details.setName("Irfan & Associates");
        office2Details.setLocation("Milwaukee, WI");
        office2Details.setNumberOfRooms(20);
        office2.setFacilityDetail(office2Details);

        //office3
        Facility office3 = new FacilityImpl();
        FacilityDetails office3Details = new FacilityDetailsImpl();
        office3.setFacilityID(3);
        office3Details.setName("Henry Inc.");
        office3Details.setLocation("New York, NY");
        office3Details.setNumberOfRooms(30);
        office3.setFacilityDetail(office3Details);

        //office4
        Facility office4 = new FacilityImpl();
        FacilityDetails office4Details = new FacilityDetailsImpl();
        office4.setFacilityID(4);
        office4Details.setName("Zewdie Firm");
        office4Details.setLocation("San Francisco, CA");
        office4Details.setNumberOfRooms(40);
        office4.setFacilityDetail(office4Details);

        //building office5
        System.out.println("\nFacilityClient: Now building a new Facility.");
        Facility office5 = new FacilityImpl();
        office5.setFacilityID(5);
        FacilityDetails detail = new FacilityDetailsImpl();
        detail.setName("John Doe Company");
        detail.setLocation("Seattle, WA");
        detail.setNumberOfRooms(50);
        office5.setFacilityDetail(detail);

        facilityService.addNewFacility(office5);
        System.out.println("FacilityClient: Facility is being placed to the Facility Database");
        System.out.println("FacilityClient: Searching for the information about the Facility");
        Facility searchedFacility = facilityService.getFacilityInformation(5);

        System.out.println("\nFacilityClient: Facility Information");
        System.out.println("\n\tFacility ID:   \t\t" + searchedFacility.getFacilityID());
        FacilityDetails facilityDet = searchedFacility.getFacilityDetail();
        System.out.println("\tInformation About Facility:  \t" + facilityDet.getName() +
                "\n\t\t\t\t Number of Rooms:" + facilityDet.getNumberOfRooms());
        if (facilityDet.getPhoneNumber() != 0) {
            System.out.print("\t\t\t\t Phone Number: " + facilityDet.getPhoneNumber() +
                    "\n\t\t\t\t" + "\n");
        } else {
            System.out.print("\t\t\t\t Phone Number: not listed" +
                    "\n\t\t\t\t" + "\n");
        }

        //phone number being added to office5's FacilityDetails
        facilityService.addFacilityDetail(5, 312555999);
        Facility updatedFacility = facilityService.getFacilityInformation(5);
        FacilityDetails facilityNewDet = updatedFacility.getFacilityDetail();

        System.out.println("\nFacilityClient: Facility Information has been updated.");
        System.out.println("\n\tFacility ID:   \t\t" + updatedFacility.getFacilityID());
        System.out.println("\tInfo About Facility:  \t" + facilityNewDet.getName() +
                "\n\t\t\t\t Number of Rooms: " + facilityNewDet.getNumberOfRooms());
        if (facilityNewDet.getPhoneNumber() != 0) {
            System.out.print("\t\t\t\t Phone Number: " + facilityNewDet.getPhoneNumber() +
                    "\n\t\t\t\t" + "\n");
        } else {
            System.out.print("\t\t\t\t Phone Number: unlisted" +
                    "\n\t\t\t\t" + "\n");
        }

        System.out.println("\nFacilityClient: Remove a Facility");
        facilityService.removeFacility(5);
        System.out.println("Facility has been removed.");

        //updated list of Facilities will print after office5 is removed  r
        System.out.println("\nFacilityClient: List of current Facilities");
        List<Facility> listOfFacilities = facilityService.listFacilities();
        for (Facility fac : listOfFacilities) {
            FacilityDetails facDet = fac.getFacilityDetail();
            System.out.println("\n\t" + facDet.getName() + " ID: " + fac.getFacilityID());
        }

        //the available capacity of office4 is being requested
        System.out.println("\nFacilityClient: Requesting Facility's Available Capacity");
        //int roomsAvail = UsageService.requestAvailableCapacity(office4);
        //System.out.println("There are " + roomsAvail + " rooms currently available at Facility #" + office4.getFacilityID() + ".");
    }
}