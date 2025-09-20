package com.carbontracker.model;

import java.util.*;

public class Admin {
    public static void main(String[] args)
    {
        
    }

    public void registerUser()
    {
        Map<String,User> Users = new HashMap<>();
        //Decided to use map because I need Key-value pairs

        Map<String,List<Activity>> UserActivities = new HashMap<>();
        System.out.println("1.Login");
        System.out.println("2.New User");


        Scanner sc = new Scanner(System.in);

        int choice;
        choice = sc.nextInt();

        while(choice != 1 && choice != 2)
        {
            System.out.println("Invalid choice");
            choice = sc.nextInt();
        }

        System.out.print("Enter Username : ");
        String username = sc.nextLine();

        System.out.print("Enter Password : ");
        String password = sc.next();

        if(choice == 2)
        {
            Users.put(username,password);
            System.out.println("Registered Susccessfully");
            User u = new User();
            u.call();
        }
        else if(choice == 1)
        {
            if(Users.containsKey(username))
            {
                String existingPass = Users.get(username);
                if(existingPass.equals(password))
                {
                    System.out.println("Login successful..!!");
                    User u = new User();
                    u.call();
                }
                else
                {
                    System.out.println("Invalid password");
                }
            }
        }
        else
        {
            System.out.println("User Not Registered");
        }
            sc.close();
    }
}
