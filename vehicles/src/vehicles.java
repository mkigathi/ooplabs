/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user2
 */
public class vehicles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motorcycle obj1=new Motorcycle();
        obj1.setColor("yellow");
        obj1.setMake("Bajaj");
        Car obj2=new Car();
       obj2.setColor("Red");
       obj2.setMake("Honda");
        obj1.Showdetails();
        obj2.Showdetails();
    }
} 
