/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user2
 */
public class Car extends Motorcycle{
    
    Car(){}
   private Car (String make, String color)
    {super(make, color);
    }

    @Override
    public String getMake() {
        return make;
    }
@Override
    public void setMake(String make) {
        this.make = make;
    }
@Override
    public String getColor() {
        return color;
    }
@Override
    public void setColor(String color) {
        this.color = color;
    }
    @Override
     public void Showdetails(){
     System.out.println("Make of Car :    " +this.make);
    System.out.println("Color of Car :   "+this.color);}
    
}
