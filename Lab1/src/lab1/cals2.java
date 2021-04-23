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
public class cals2 {
    
    public static void main(String[] args) {
        int int1;
        int int2;
        int int3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three (3) numbers:");
        int1=input.nextInt();
        int2=input.nextInt();
        int3=input.nextInt();
        
        int sum = int1+int2+int3;
        int product=int1*int2*int3;
        int average=sum/3;
        
        System.out.println ("Sum  : "+sum);
        System.out.println ("Product  : "+product);
        System.out.println ("Average   : "+average);
        
        
        
    }
    
}
