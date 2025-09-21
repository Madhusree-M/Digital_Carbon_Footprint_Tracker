package com.carbontracker.model;

import java.util.*;

public class Admin {
    Map<String,User> Users = new HashMap<>();
        //Decided to use map because I need Key-value pairs
        //Example "Madhu" with ["Madhu","1234"];
        //Used Value type as User bacause,
            //In future I can store more details like Email, phone number

    Map<String,List<Activity>> UserActivities = new HashMap<>();
        //This map is to Connect User and their activities

    public static void main(String[] args)
    {
        Admin admin = new Admin();
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("\n---------- Digital Carbon Footprint Tracker -----------\n");
            System.out.println("1.Register");
            System.out.println("2.Login");
            System.out.println("3.Exit");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            sc.nextLine();
            //Next Input is String (username) so getting that new line

            switch (choice) 
            {
                case 1:
                    admin.registerUser(sc);
                    break;
                case 2:
                    admin.loginUser(sc);
                    break;
                case 3:
                    System.out.println("Thank You!!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(choice != 3);
        sc.close();
    }

    public void registerUser(Scanner sc)
    {
        System.out.print("Enter Username : ");
        String username = sc.nextLine().trim();
        //Testing : Without trim -> Username and password can have leading spaces

        while(Users.containsKey(username))
        {
            System.out.println("Username not available. Try again!!");
            System.out.print("Enter Username : ");
            username = sc.nextLine().trim();
        }

        System.out.print("Enter password : ");
        String password = sc.nextLine().trim();

        User newUser = new User(username, password);
        Users.put(username,newUser);
        UserActivities.put(username, new ArrayList<>());
        System.out.println("Registration Successful..!!");
    }

    public void loginUser(Scanner sc)
    {
        System.out.print("Enter Username : ");
        String username = sc.nextLine().trim();

        System.out.print("Enter password : ");
        String password = sc.next().trim();

        if(Users.containsKey(username))
        {
            User oldUser = Users.get(username);
            if(oldUser.getPassword().equals(password))
            {
                System.out.println("Login successful..!!");
                System.out.println("Welcome "+username+"!!\n");
                oldUser.call();
                //Entire work of User class is called here
            }
            else
            {
                System.out.println("Invalid Password");
            }
        }
        else
        {
            System.out.println("Invalid Username");
        }
    }
}