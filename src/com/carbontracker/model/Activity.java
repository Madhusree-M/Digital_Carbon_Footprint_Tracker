package com.carbontracker.model;
import java.util.Scanner;

//abstract class
public abstract class Activity {
    protected String type;
    public double emission; //mentioned as public because User class is using this datamember

    //Abstraction
    public abstract void inputData(Scanner sc);
    public abstract void calculateEmission();
    public abstract void displayResult();
}
