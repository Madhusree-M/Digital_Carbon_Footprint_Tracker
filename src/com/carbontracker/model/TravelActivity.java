package com.carbontracker.model;
import java.util.Scanner;

//In travel class - I have tried for few types of vehicles
//Followed naming conventions like constants in caps

public class TravelActivity extends Activity
{
    String mode;      // travel mode
    double distance;  // distance travelled in km
    
    //CO2 in kg per km
    //final variables are used because.. easy to modify in future
    final double CAR_FACTOR = 0.21;
    final double BUS_FACTOR = 0.10;
     final double BIKE_FACTOR = 0.12;
    final double TRAIN_FACTOR = 0.05;
    final double PLANE_FACTOR = 0.25;

    //for saving particular type factor
    double local_factor;
    @Override
    public void inputData(Scanner sc) 
    {
        System.out.println("Choose your mode of travel:");
        System.out.println("1. Car");
        System.out.println("2. Bus");
        System.out.println("3. Bike");
        System.out.println("4. Train");
        System.out.println("5. Aeroplane");

        int choice = sc.nextInt();
        System.out.print("Enter distance travelled (in km): ");
        distance = sc.nextDouble();
        
        switch (choice) 
        {
            case 1: 
                mode = "Car";
                local_factor = CAR_FACTOR;
                break;
            case 2: 
                mode = "Bus";
                local_factor = BUS_FACTOR;
                break;
            case 3: mode = "Two-Wheeler";
                local_factor = BIKE_FACTOR;
                break;
            case 4: mode = "Train"; 
                local_factor = TRAIN_FACTOR;
                break;
            case 5: mode = "Aeroplane";
                local_factor = PLANE_FACTOR;
                break;
            default: 
                System.out.println("Invalid choice!!(Default set to car)");
                mode = "Car"; 
                break;
        }
    }

    @Override
    public void calculateEmission()
    {
        emission = distance * local_factor;
    }
    
    @Override
    public void displayResult() 
    {
        System.out.println("Travel Mode: " + mode);
        System.out.println("Distance Travelled: " + distance + " km");
        System.out.println("Estimated Emissions: " + emission + " kg CO2");
    }
}