package com.Client;

import java.util.List;
import com.Facility.*;
import com.Maintenance.maintenance;
import com.Service.serviceMaintenance;

public class maintenanceClient {
        public maintenanceClient() throws Exception {

            serviceMaintenance serviceMaintenance = new serviceMaintenance();

            /**
             *Adding office locations for facilities.
             */

            //office1
            facility office1 = new facilityImplement();
            facilityInfo office1Details = new facilityInfoImplement();
            office1.setFacilityID(1);
            office1Details.setName("Anissa Corporations");
            office1Details.setLocation("Chicago, IL");
            office1Details.setNumberOfRooms(10);
            office1.setFacilityDetail(office1Details);

            //office2
            facility office2 = new facilityImplement();
            facilityInfo office2Details = new facilityInfoImplement();
            office2.setFacilityID(2);
            office2Details.setName("Irfan & Associates");
            office2Details.setLocation("Milwaukee, WI");
            office2Details.setNumberOfRooms(20);
            office2.setFacilityDetail(office2Details);

            //office3
            facility office3 = new facilityImplement();
            facilityInfo office3Details = new facilityInfoImplement();
            office3.setFacilityID(3);
            office3Details.setName("Henry Inc.");
            office3Details.setLocation("New York, NY");
            office3Details.setNumberOfRooms(30);
            office3.setFacilityDetail(office3Details);

            //office4
            facility office4 = new facilityImplement();
            facilityInfo office4Details = new facilityInfoImplement();
            office4.setFacilityID(4);
            office4Details.setName("Zewdie Firm");
            office4Details.setLocation("San Francisco, CA");
            office4Details.setNumberOfRooms(40);
            office4.setFacilityDetail(office4Details);

            //maintenance request for office1 case example
            System.out.println("\nmaintenanceClient: Creating New Maintenance Request");
            Maintenance maintenance = maintenanceService.makeFacilityMaintRequest(office1, "Printers are not connecting to Internet.", 50);
            System.out.println("\nmaintenanceClient: Maintenance Request has been created.");

            //scheduling the case example for maintenance request
            System.out.println("\nmaintenanceClient: Scheduling Maintenance Request");
            maintenanceService.scheduleMaintenance(maintenance);
            System.out.println("\nmaintenanceClient: Maintenance Request has been scheduled.");

            //adding the total cost of maintenance request at office1
            System.out.println("\nmaintenanceClient: Estamating Total Maintenance Cost");
            int totalCost = maintenanceService.calcMaintenanceCostForFacility(office1);
            System.out.println("The total cost of maintenance at Facility #" + office1.getFacilityID() + " is $" + totalCost + ".");

            //arranging current maintenance requests in a table using example Facilities example - the offices listed above
            System.out.println("\nmaintenanceClient: Listing the Current Maintenance Requests at Facility");
            List<Maintenance> maintRequestList = maintenanceService.listMaintRequests(office2);
            Object[][] requests = new Object[maintRequestList.size() + 1][2];
            requests[0] = new Object[]{"Maintenance Request Details", "Cost"};
            for (int i = 1; i <= maintRequestList.size(); i++) {
                requests[i] = new Object[]{maintRequestList.get(i - 1).getMaintenanceDetails(), maintRequestList.get(i - 1).getCost()};
            }
            System.out.println("Current Maintenance Requests at Facility #" + office2.getFacilityID() + ":");
            for (Object[] row : requests) {
                System.out.format("   %-29s%6s\n", row);
            }

            //arranging completed maintenance requests in a table using example Facilities example - the offices listed above
            System.out.println("\nMaintenanceClient: Listing Completed Maintenance Requests at Facility");
            List<Maintenance> maintenanceList = maintenanceService.listMaintenance(office2);
            Object[][] maintenanceTable = new Object[maintenanceList.size() + 1][2];
            maintenanceTable[0] = new Object[]{"Maintenance Details", "Cost"};
            for (int i = 1; i <= maintenanceList.size(); i++) {
                maintenanceTable[i] = new Object[]{maintenanceList.get(i - 1).getMaintenanceDetails(), maintenanceList.get(i - 1).getCost()};
            }
            System.out.println("Completed Maintenance Requests at Facility #" + office2.getFacilityID() + ":");
            for (Object[] row : maintenanceTable) {
                System.out.format("   %-30s%6s\n", row);
            }

            //arranging Facility problems in a table
            System.out.println("\nMaintenanceClient: Listing Problems Affecting the Facility");
            List<Maintenance> facilityProblemsList = maintenanceService.listFacilityProblems(office2);
            Object[][] problems = new Object[facilityProblemsList.size() + 1][2];
            problems[0] = new Object[]{"Problem Details", "Cost"};
            for (int i = 1; i <= facilityProblemsList.size(); i++) {
                problems[i] = new Object[]{facilityProblemsList.get(i - 1).getMaintenanceDetails(), facilityProblemsList.get(i - 1).getCost()};
            }
            System.out.println("Problems affecting Facility #" + office2.getFacilityID() + ":");
            for (Object[] row : problems) {
                System.out.format("   %-30s%6s\n", row);
            }

            //calculating the down time for a Facility
            System.out.println("\nMaintenanceClient: Calculating Facility Down Time");
            int downTime = maintenanceService.calcDownTimeForFacility(office2);
            System.out.println("Facility #" + office2.getFacilityID() + " was down for maintenance for " + downTime + " days, "
                    + "under the impression each completed maintenance request took one work week - 5 days - to complete.");

            //calculating the problem rate for a Facility
            System.out.println("\nMaintenanceClient: Calculating Facility Problem Rate");
            double problemRate = maintenanceService.calcProblemRateForFacility(office2) * 100;
            System.out.print("\nThe problem rate at Facility #" + office2.getFacilityID() + " is ");
            System.out.format("%.2f", problemRate);
            System.out.print("%.");
        }

    }
