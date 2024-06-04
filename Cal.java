
package com.mycompany.cal;

import java.util.Scanner;

public class Cal {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double num1,num2;
       char c ;
       System.out.print("enter Number 1:");
       num1 = input.nextDouble();
       System.out.print("enter Opretaion like +,-,*,/:");
       c = input.next().charAt(0);
       System.out.print("enter Number 2:");
       num2 = input.nextDouble();
       System.out.println("the sum is:"+sum(num1,c,num2));
    }
    
  public static double sum(double num1, char c, double num2){
    double result = 0;
    switch(c){
      case'+':
          result = num1 + num2;
      break;
      case'-':
          result = num1 - num2;
      break;
      case'*':
          result = num1 * num2;
      break;
      case'/':
          if (num2 != 0) {
          result = num1 / num2;
          }
      
    }
    
    
    
    
    return result;
  }
    
}
double result = 0;