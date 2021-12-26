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
public class Delete {
    static void delete_element(int []a,int n){
        for (int i = 0; i <a.length; i++) {
            if (a[i]==n)
            {
                for (int j = i; j <a.length-1; j++) {
                    a[j]=a[j+1];
                   
                }
 
            }
           
        }
    
    }
}
