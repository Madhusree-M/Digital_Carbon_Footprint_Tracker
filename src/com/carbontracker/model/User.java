package com.carbontracker.model;
import java.util.*;

//Main Class 

public class User {
    private String username;
    private String password;
    
    //Constructor
    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    //Encapsulation used (Getters)
    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    //Everything in one function - easy to call
    public void call()
    {
        Scanner sc = new Scanner(System.in);
        List<Activity> activities = new Vector<>();
        //Activity can store any type - Travel,Electricity,Food
        //Used List so as to maintain theorder
        //Vector for multithreading
        

        int choice;
        do 
        {
            System.out.println("\n1.Add Electricity Activity");
            System.out.println("2.Add Travel Activity");
            System.out.println("3.Add Food Activity");
            System.out.println("4.Show Summary & Exit");
            System.out.print("\nEnter your choice: ");
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
                    System.out.println("\n\nGenerating summary...");
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
        System.out.println("\n\n=============== Carbon Footprint Summary ===============");
        for (Activity act : activities) 
        {
            act.calculateEmission();
            act.displayResult();
            totalEmissions += act.emission;
            System.out.println("--------------------------------------------------------");
        }

        System.out.println("TOTAL ESTIMATED CARBON EMISSIONS: " + totalEmissions + " kg CO2");
        System.out.println("========================================================");
    }
}
