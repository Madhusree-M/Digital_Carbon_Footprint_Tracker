package com.carbontracker.model;

import java.util.Scanner;

public class FoodActivity extends Activity{

    int numMeals;
    @O
    public void inputFoodData(Scanner sc)
    {
        System.out.println("Choose Food Type : ");
        System.out.print("1. Veg Meals");
        System.out.print("2. Non - Veg Meals");

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
                System.out.println("Invalid choice");
                type = null;
        }
    }
}