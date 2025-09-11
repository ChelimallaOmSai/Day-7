package com.codegyan.arrays;

public class First_and_Last {

    public static boolean commonEnd(int[] a, int[] b) {
       
        boolean sameFirst = a[0] == b[0];   // Check if the first elements are equal

        boolean sameLast = a[a.length - 1] == b[b.length - 1];  // Check if the last elements are equal

        return sameFirst || sameLast;  // Return true if either the first or last elements are the same
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));       
        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));   
        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));       
        System.out.println(commonEnd(new int[]{1}, new int[]{1}));                
        System.out.println(commonEnd(new int[]{1}, new int[]{2}));                 
    }
}