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
public class Search {
    static int lsearch(int[]arr,int n){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==n) {
                System.out.println("Found");
                return 1;
            }
        }
        System.out.println("Not found");
        return -1;
    }
    //method to search in sorted array
     static void binarySearch(int arr[], int key){  
         int first=0;
         int last=arr.length-1;
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   } 
     }
    
}
