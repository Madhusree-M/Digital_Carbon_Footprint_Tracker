package com.carbontracker.model;
import java.util.Scanner;

//Inheritance

//Activity -> FoodActivity

public class FoodActivity extends Activity{

    int numMeals;

    //Abstraction
    @Override
    public void inputData(Scanner sc)
    {
        System.out.println("Choose Food Type : ");
        System.out.println("1. Veg Meals");
        System.out.println("2. Non - Veg Meals");

        int choice = sc.nextInt();
        System.out.print("Enter number of Meals : ");
        numMeals = sc.nextInt();
        
        switch(choice)
        {
            case 1 :
                type = "Veg Meals";
                break;
            case 2:
                type = "Non - veg Meals";
                break;
            default:
                System.out.println("Invalid choice, defaulting to Veg.");
                type = "Veg Meals";
        }
    }
    @Override
    public void calculateEmission() 
    {
        if (type.equals("Veg Meals")) {
            emission = numMeals * 1.2;
        } else {
            emission = numMeals * 2.5;
        }
    }
}