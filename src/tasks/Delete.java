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
        int size=a.length;
        for (int i = 0; i < size; i++) {
            if (a[i]==n)
            {
             continue;  
            }
            System.out.println(a[i]);
        }
    
    }
}
