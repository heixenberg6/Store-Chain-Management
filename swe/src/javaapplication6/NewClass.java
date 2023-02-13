/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author harsh
 */
public class NewClass {
    
    public static void main(String[] args) throws Exception {
    // write your code here

    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
    }
    
    System.out.println();
    int k=scn.nextInt();
    
   
    
    bs(arr,k);
    
}
    
    public static int bs(int[] arr, int k){
        int lo=0;
        int hi=arr.length-1;
        
        int mid=(arr.length -1)/2;
        while(lo<=hi){
            if(k<arr[mid]){
                    hi=mid-1;
            }
            else if(k>arr[mid])
                lo=mid+1;
            
            else if(k==arr[mid])
            { System.out.print("Element found at index "+(mid+1));
                return mid;}
        }
        
        System.out.print("Element not found.");
        return -1;
    }
}
