//package com.Client;
//
//import java.util.List;
//import com.Facility.*;
//import com.Service.*;
//import com.Use.*;
//import java.time.LocalDate;
//
//public class useClient
//{
//        public useClient() throws Exception {
//
//            useClient useClient = new useClient();
//            serviceFacility serviceFacility = new serviceFacility();
//
//            /**
//             *Adding office locations for facilities.
//             */
//
//            //office1
//            facility office1 = new facilityImplement();
//            facilityInfo office1Details = new facilityInfoImplement();
//            office1.setFacilityID(1);
//            office1Details.setName("Anissa Corporations");
//            office1Details.setLocation("Chicago, IL");
//            office1Details.setNumberOfRooms(10);
//            office1.setFacilityDetail(office1Details);
//
//            //office2
//            facility office2 = new facilityImplement();
//            facilityInfo office2Details = new facilityInfoImplement();
//            office2.setFacilityID(2);
//            office2Details.setName("Irfan & Associates");
//            office2Details.setLocation("Milwaukee, WI");
//            office2Details.setNumberOfRooms(20);
//            office2.setFacilityDetail(office2Details);
//
//            //office3
//            facility office3 = new facilityImplement();
//            facilityInfo office3Details = new facilityInfoImplement();
//            office3.setFacilityID(3);
//            office3Details.setName("Henry Inc.");
//            office3Details.setLocation("New York, NY");
//            office3Details.setNumberOfRooms(30);
//            office3.setFacilityDetail(office3Details);
//
//            //office4
//            facility office4 = new facilityImplement();
//            facilityInfo office4Details = new facilityInfoImplement();
//            office4.setFacilityID(4);
//            office4Details.setName("Zewdie Firm");
//            office4Details.setLocation("San Francisco, CA");
//            office4Details.setNumberOfRooms(40);
//            office4.setFacilityDetail(office4Details);
//
//            System.out.println("\nUsageClient: Facility Inspections");
//
//            //inspection status for office4 case example
//            System.out.println("\n\tInspections At Facility #" + office4.getFacilityID());
//            for (facilityInspect inspection : serviceUse.listInspections(office4)) {
//                System.out.println("\t" + inspection.getInspection_type() +
//                        " status: " + inspection.getInspection_detail());
//            }
//
//            //office5 (new Facility) will be checked for usage interval
//            facility office5 = new facilityImplement();
//            facilityInfo officeUse = new facilityInfoImplement();;
//            officeUse.setFacilityID(5);
//            facilityInfo officeDetails = new facilityInfoImplement();
//            officeDetails.setNumberOfRooms(50);
//            officeDetails.setName("John Doe Company");
//            officeDetails.setLocation("Seattle, WA");
//            officeDetails.setFacilityID(5);
//            office5.setFacilityDetail(officeDetails);
//            facilityService.addNewFacility(office5);
//            officeUse.setStartDate(LocalDate.of(2020, 1, 1));
//            officeUse.setEndDate(LocalDate.of(2020, 12, 31));
//            officeUse.setRoomNumber(1);
//
//            System.out.println("\nUsageClient: Checking to see if Facility is in use");
//
//            boolean result = useService.isInUseDuringInterval(office5, officeUse);
//
//            System.out.print("\tFacility #" + officeUse.getFacilityID());
//            if (officeUse.getRoomNumber() != 0) {
//                System.out.print(" - Room " + officeUse.getRoomNumber());
//            }
//            if (result) { //if being used
//                System.out.print(" IS ");
//            } else { //if not in use
//                System.out.print(" is NOT ");
//            }
//            System.out.print("in use from " + officeUse.getStartDate() + " to " + officeUse.getEndDate() + ".\n");
//
//            //placing the facility to use during the previously checked room and start/end date
//            System.out.println("\nUsageClient: Assigning Facility Use");
//            useService.assignFacilityToUse(office5, officeUse);
//            System.out.println("\nUsageClient: Facility/Room has been assigned.");
//
//            //checking again if facility is in use
//            System.out.println("\nUsageClient: Checking if Facility is in use");
//
//            boolean result2 = useService.isInUseDuringInterval(office5, officeUse);
//
//            System.out.print("\tFacility #" + officeUse.getFacilityID());
//            if (officeUse.getRoomNumber() != 0) {
//                System.out.print(" - Room " + officeUse.getRoomNumber());
//            }
//            if (result2) { //if being used
//                System.out.print(" IS ");
//            } else { //if not in use
//                System.out.print(" is NOT ");
//            }
//            System.out.print("in use from " + officeUse.getStartDate() + " to " + officeUse.getEndDate() + ".\n");
//
//            //Creating list of actual use of office5
//            System.out.println("\nUsageClient: Calculating actual use of Facility");
//
//            List<FacilityUse> usageList = useService.listActualUsage(office5);
//            Object[][] usage = new Object[usageList.size() + 1][3];
//            usage[0] = new Object[] {"Room #", "Start Date", "End Date"};
//            for (int i = 1; i <= usageList.size(); i++) {
//                usage[i] = new Object[] {usageList.get(i-1).getRoomNumber(), usageList.get(i-1).getStartDate().toString(),
//                        usageList.get(i-1).getEndDate().toString()};
//                if ((int) usage[i][0] == 0) {
//                    usage[i][0] = "all";
//                }
//            }
//            System.out.println("Use at Facility #" + officeUse.getFacilityID());
//            for (Object[] row : usage) {
//                System.out.format("\t%-10s%-15s%-15s\n", row);
//            }
//
//            //vacating office5
//            System.out.println("\nUsageClient: Vacating Facility");
//            serviceUse.vacateFacility(office5, 1);
//            System.out.println("\nUsageClient: Facility has been vacated.");
//
//            //check office5 usage after being vacated
//            System.out.println("\nUsageClient: Calculating Facility use after being vacated");
//
//            List<facilityUse> usageList2 = serviceUse.listActualUsage(office5);
//            Object[][] usage2 = new Object[usageList2.size() + 1][3];
//            usage2[0] = new Object[] {"Room #", "Start Date", "End Date"};
//            for (int i = 1; i <= usageList2.size(); i++) {
//                usage2[i] = new Object[] {usageList2.get(i-1).getRoomNumber(), usageList2.get(i-1).getStartDate().toString(),
//                        usageList2.get(i-1).getEndDate().toString()};
//                if ((int) usage2[i][0] == 0) {
//                    usage2[i][0] = "all";
//                }
//            }
//            System.out.println("Use at Facility #" + officeUse.getFacilityID());
//            for (Object[] row : usage2) {
//                System.out.format("\t%-10s%-15s%-15s\n", row);
//            }
//
//            //getting the current use rate of a facility
//            System.out.println("\nUsageClient: Calculating the current use rate of Facility");
//            int usageRate = (int) (serviceUse.calcUsageRate(office2) * 100);
//            System.out.println("Current use rate at Facility #" + office2.getFacilityID() + " is " + usageRate + "%.");
//
//            //removes office5 so it can be tested again later
//            serviceFacility.removeFacility(5);
//        }
//}
