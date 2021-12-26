/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

/**
 *
 * @author SMART
 */
public class Task1 {
    //sum of digits to be one digits
     public static int Sum_digits(int n){
     int sum=0;   
    while(n>0) 
       {int a=n%10;
           sum+=a;
           n/=10;
       }
        if (sum<10) {
            return sum;
        }
    return Sum_digits(sum);
    }
}
