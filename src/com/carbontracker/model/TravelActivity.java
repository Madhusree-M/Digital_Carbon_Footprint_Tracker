package com.carbontracker.model;

import java.util.Scanner;

public class TravelActivity extends Activity
{
    private String mode;      // travel mode (car, bus, etc.)
    private double distance;  // distance travelled in km
    // private double emissions; // calculated emissions
    
    // Example emission factors (kg CO2 per km per passenger)
    private final double CAR_FACTOR = 0.21;       // per km
    private final double BUS_FACTOR = 0.10;
    private final double BIKE_FACTOR = 0.12;
    private final double TRAIN_FACTOR = 0.05;
    private final double PLANE_FACTOR = 0.25;

    @Override
    public void inputData(Scanner sc) 
    {
        System.out.println("Choose your mode of travel:");
        System.out.println("1. Car");
        System.out.println("2. Bus");
        System.out.println("3. Two-Wheeler");
        System.out.println("4. Train");
        System.out.println("5. Airplane");

        int choice = sc.nextInt();
        System.out.print("Enter distance travelled (in km): ");
        distance = sc.nextDouble();

        switch (choice) 
        {
            case 1: mode = "Car"; emission = distance * CAR_FACTOR; break;
            case 2: mode = "Bus"; emission = distance * BUS_FACTOR; break;
            case 3: mode = "Two-Wheeler"; emission = distance * BIKE_FACTOR; break;
            case 4: mode = "Train"; emission = distance * TRAIN_FACTOR; break;
            case 5: mode = "Airplane"; emission = distance * PLANE_FACTOR; break;
            default: 
                System.out.println("Invalid choice! Defaulting to Car.");
                mode = "Car"; 
        }
    }

    @Override
    public void calculateEmission()
    {
        emission = distance * CAR_FACTOR;
    }
    @Override
    public void displayResult() {
        System.out.println("Travel Mode: " + mode);
        System.out.println("Distance Travelled: " + distance + " km");
        System.out.println("Estimated Emissions: " + emission + " kg CO2");
    }
}