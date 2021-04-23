package lab1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author user2
 */
public class calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter No. From 1-5");
      n=input.nextInt();
      if(n%2==0)
      {
          System.out.print("Lucky Guess");
      }
      else
      {
          System.out.print("“Better Luck Next Time");
      }
    }
    
}
