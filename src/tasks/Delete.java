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
    static int[] delete_element(int []a,int n){
        int[]b=new int[a.length-1];
        for (int i = 0,j=0; i < a.length; i++) {
            if (a[i]==n) {
                continue;
            }
            b[j++]=a[i];
        }
    return b;
    
    }
}
