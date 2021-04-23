/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author user2
 */
public class Student extends Person {
       private  String NumOfCourses;
    public Student(String name, String gender, String DateOfBirth,String NumOfCourses ) {
        super(name, gender, DateOfBirth);
        this.NumOfCourses=NumOfCourses;
    }

    public String getNumOfCourses() {
        return NumOfCourses;
    }

    public void setNumOfCourses(String NumOfCourses) {
        this.NumOfCourses = NumOfCourses;
    }
    
     public void Showdetails2(){
     System.out.println("Name of Person :    " +this.name);
     System.out.println("Gender :   "+this.gender);
     System.out.println("Gender :   "+this.DateOfBirth);
     System.out.println("No. Of Courses :   "+this.NumOfCourses);

     }

    @Override
    public double processLoan() {
         LocalDate pdate = LocalDate.of(2012, 01, 01);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
        
    
           return 0;
        
    }
    
}

 

