package com.carbontracker.model;
import java.util.*;

//Main Class 

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Activity> activities = new ArrayList<>();
        //Activity can store any type - Travel,Electricity,Food
        //Used List so as to maintain theorder
        
        int choice;
        do 
        {
            System.out.println("\n--- Digital Carbon Footprint Tracker ---");
            System.out.println("1. Add Electricity Activity");
            System.out.println("2. Add Travel Activity");
            System.out.println("3. Add Food Activity");
            System.out.println("4. Show Summary & Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            Activity activity = null;

            switch (choice) 
            {
                case 1:
                    activity = new ElectricityActivity();
                    break;
                case 2:
                    activity = new TravelActivity();
                    break;
                case 3:
                    activity = new FoodActivity();
                    break;
                case 4:
                    System.out.println("\nGenerating summary...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }

            if (activity != null) 
            {
                activity.inputData(sc);
                activities.add(activity);
            }

        } while (choice != 4);

        // Print summary
        double totalEmissions = 0;
        System.out.println("\n===== Carbon Footprint Summary =====");
        for (Activity act : activities) 
        {
            act.displayResult();
            act.calculateEmission();
            totalEmissions = act.emission;
            System.out.println("-----------------------------------");
        }

        System.out.println("TOTAL ESTIMATED CARBON EMISSIONS: " + totalEmissions + " kg CO2");
        System.out.println("===================================");
    }
}
