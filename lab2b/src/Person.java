/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user2
 */
import java.text.SimpleDateFormat;  
import java.util.Date; 

public class Person {
     //Private variable 
    protected String name;
    protected String gender;
    protected String DateOfBirth;
//constructor
    public Person(String name, String gender, String DateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.DateOfBirth = DateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        Date date = new Date();  
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
    this.DateOfBirth= formatter.format(date); 
    return DateOfBirth;
        
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }
   
    
     public void Showdetails(){
     System.out.println("Name of Person :    " +this.name);
     System.out.println("Gender :   "+this.gender);
     System.out.println("Gender :   "+this.DateOfBirth);
     }
    
}


