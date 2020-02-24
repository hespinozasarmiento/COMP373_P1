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
                facility office1 = new facilityImplement();
                facilityInfo office1Details = new facilityInfoImplement();
                office1.setfacilityID(1);
                office1Details.setName("Anissa Corporations");
                office1Details.setLocation("Chicago, IL");
                office1Details.setNumberOfRooms(10);
                office1.setfacilityInfo(office1Details);

                //office2
                facility office2 = new facilityImplement();
                facilityInfo office2Details = new facilityInfoImplement();
                office2.setfacilityID(2);
                office2Details.setName("Irfan & Associates");
                office2Details.setLocation("Milwaukee, WI");
                office2Details.setNumberOfRooms(20);
                office2.setfacilityInfo(office2Details);

                //office3
                facility office3 = new facilityImplement();
                facilityInfo office3Details = new facilityInfoImplement();
                office3.setfacilityID(3);
                office3Details.setName("Henry Inc.");
                office3Details.setLocation("New York, NY");
                office3Details.setNumberOfRooms(30);
                office3.setfacilityInfo(office3Details);

                //office4
                facility office4 = new facilityImplement();
                facilityInfo office4Details = new facilityInfoImplement();
                office4.setfacilityID(4);
                office4Details.setName("Zewdie Firm");
                office4Details.setLocation("San Francisco, CA");
                office4Details.setNumberOfRooms(40);
                office4.setfacilityInfo(office4Details);

                //building office5
                System.out.println("\nFacilityClient: Now building a new Facility.");
                facility office5 = new facilityImplement();
                office5.setfacilityID(5);
                facilityInfo detail = new facilityInfoImplement();
                detail.setName("John Doe Company");
                detail.setLocation("Seattle, WA");
                detail.setNumberOfRooms(50);
                office5.setfacilityInfo(detail);

                serviceFacility.addNewfacility(office5);
                System.out.println("FacilityClient: Facility is being placed to the Facility Database");
                System.out.println("FacilityClient: Searching for the information about the Facility");
                facility searchedFacility = serviceFacility.getFacilityInformation(5);

                System.out.println("\nFacilityClient: Facility Information");
                System.out.println("\n\tFacility ID:   \t\t" + searchedFacility.getfacilityID());
                facilityInfo facilityInfo = searchedFacility.getfacilityDetail();
                System.out.println("\tInformation About Facility:  \t" + facilityInfo.getName() +
                        "\n\t\t\t\t Number of Rooms:" + facilityInfo.getNumberOfRooms());
                if (facilityInfo.getPhoneNumber() != 0) {
                        System.out.print("\t\t\t\t Phone Number: " + facilityInfo.getPhoneNumber() +
                                "\n\t\t\t\t" + "\n");
                } else {
                        System.out.print("\t\t\t\t Phone Number: not listed" +
                                "\n\t\t\t\t" + "\n");
                }

                //phone number being added to office5's facilityInfo
                serviceFacility.addFacilityDetail(5, 312555999);
                facility updatedFacility = serviceFacility.getFacilityInformation(5);
                facilityInfo facilityNewDet = updatedFacility.getfacilityDetail();

                System.out.println("\nFacilityClient: Facility Information has been updated.");
                System.out.println("\n\tFacility ID:   \t\t" + updatedFacility.getfacilityID());
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
                serviceFacility.removeFacility(5);
                System.out.println("Facility has been removed.");

                //updated list of Facilities will print after office5 is removed  r
                System.out.println("\nFacilityClient: List of current Facilities");
                List<facility> listOfFacilities = serviceFacility.listFacilities();
                for (facility fac : listOfFacilities) {
                        facilityInfo facDet = fac.getfacilityDetail();
                        System.out.println("\n\t" + facDet.getName() + " ID: " + fac.getfacilityID());
                }

                //the available capacity of office4 is being requested
                System.out.println("\nFacilityClient: Requesting Facility's Available Capacity");
                //int roomsAvail = UsageService.requestAvailableCapacity(office4);
                //System.out.println("There are " + roomsAvail + " rooms currently available at Facility #" + office4.getFacilityID() + ".");
        }
}