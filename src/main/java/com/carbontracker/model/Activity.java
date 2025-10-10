package com.carbontracker.model;
import java.util.Scanner;
import java.time.LocalDate;

//abstract class
public abstract class Activity {
    protected String type;
    public double emission; //mentioned as public because User class is using this datamember

    private LocalDate date;

    //Constructor
    Activity()
    {
        date = LocalDate.now();
        //By default , date will be set to Today
    }
    //Gtter
    LocalDate getDate()
    {
        return date;
    }
    //Setter
    void setDate(LocalDate date)
    {
        this.date = date;
    }

    //Abstraction
    public abstract void inputData(Scanner sc);
    public abstract void calculateEmission();
    public abstract void displayResult();
}
