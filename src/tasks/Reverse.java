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
public class Reverse {
    static int[] reverse(int[]a){
    int[]b=new int[a.length];
        for (int i =0; i<a.length; i++) {
            b[i]=a[a.length-i-1];
            
        }
    return b;
    }
}
