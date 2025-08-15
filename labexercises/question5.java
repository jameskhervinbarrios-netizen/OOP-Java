package labexercises;


import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
    public class question5{
    public static void main(String []args){
     Scanner sc = new
     Scanner(System.in);  
        
      
        
        
        System.out.print("Input first number: ");
        int num1 = sc.nextInt();
    
        System.out.print("Input second number: ");
        int num2 = sc.nextInt();
        
        int product = num1 * num2;
        System.out.println(num1+ " x " + num2 +" = " + product);
        sc.close();
        
        
        
        
    
}
}
