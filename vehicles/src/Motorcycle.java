/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user2
 */
public class Motorcycle {
   protected String make;
   protected String color;
   protected boolean engineState;
   
//public void Motorcycle(String make,String color,boolean engineState)}
//this.make=make;
//this.color=color;
//this.engineState=engineState;

  Motorcycle(){}
    Motorcycle(String make, String color) {
        this.make = make;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void Showdetails(){
     System.out.println("Make of Motor Cycle:    " +this.make);
    System.out.println("Color of Motor Cycle:   "+this.color);}
    
    

}
