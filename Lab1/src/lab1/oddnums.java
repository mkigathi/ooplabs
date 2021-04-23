/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author user2
 */
public class oddnums {
   
    
     public static void main(String[] args) {
         int upper_limit=100;
         System.out.println("Printing Odd numbers between 1 and " + upper_limit);
         
         for (int i=1; i<=upper_limit;i++){
             if (i%2 !=0){
                 System.out.print(i+"");
             }
         }
     }
}
