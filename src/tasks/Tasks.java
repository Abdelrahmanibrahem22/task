/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SMART
 */
public class Tasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6,7,8,9,10};
        int n=5;
       /* for (int i = 0; i <a.length; i++) {
            if (a[i]==n) {
              continue;
            }
            System.out.println(a[i]);
        }
         */
      // Delete.delete_element(a, n);
    Delete.delete_element(a, n);
        for (int i = 0; i < a.length-1; i++) {
            System.out.println(a[i]);
        }
    }
 
}
