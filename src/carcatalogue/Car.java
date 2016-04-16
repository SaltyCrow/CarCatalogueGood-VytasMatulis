/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carcatalogue;

/**
 *
 * @author user
 */
public class Car extends Vehicle {
    
    
    //encapsualataed variables
    private int seatsVehicle;
    private double timeRide;
    
    //constants
    private final int doorNumber = 4;
    private final double speedRide = 1; //km/min

    /**
     * constructor
     * pre: none
     * post: a car with an owner has been created
     * @param owner
     */
    
    public Car(String owner)
    {
        super(owner);
    }
    
    /**
     * constructor
     * pre: none
     * post: a car with an owner and ride time has been created
     * @param owner
     * @param input
     */
    
    public Car(String owner, double input)
    {
        super(owner);
        
        timeRide = input; 
    }
    
    /**
     * Changes the number seats of the car
     * pre: none
     * post: the seats number has been changed
     * @param seats
     */
    
    public void setSeats(int seats)
    {
        seatsVehicle = seats;
    }
    
    /**
     * Returns the number of seats of the car
     * pre: none
     * post: the seats number has been returned
     * @return 
     */
    
    public int getSeats()
    {
        return(seatsVehicle);
    }
    
    /**
     * Returns the number of doors of the car
     * pre: none
     * post: the doors number has been returned
     * @return 
     */
    
    public int getDoors()
    {
        return(doorNumber);
    }
    
    /**
     * Returns the ride time
     * pre: none
     * post: the ride time has been returned
     * @return 
     */
    
    public double getTime()
    {
        
        System.out.println(timeRide);
        return(timeRide);
    }
    
    /**
     * Go for a ride
     * pre: none
     * post: outputs the ride (brand, name, distance, time) 
     */
    @Override
    public void drive()
    {   
        System.out.println("Your new " + super.getBrand()+ " " + super.getName() + " goes vroom, vroom!" );
        System.out.println("You have chosen a " + this.getTime() + " minute ride." );
        System.out.println("You can go " + this.getTime() * speedRide + " km.");     
    } 
}
