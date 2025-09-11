package com.codegyan.arrays;

public class arraySum {
    public static int sumFirstTwoElements(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; 
        } else if (nums.length == 1) {
            return nums[0]; 
        } else {
            return nums[0] + nums[1]; 
        }
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3};
        System.out.println("Sum of first two elements in {1, 2, 3}: " + sumFirstTwoElements(arr1)); 

        int[] arr2 = {5, 5};
        System.out.println("Sum of first two elements in {5, 5}: " + sumFirstTwoElements(arr2));   

        int[] arr3 = {8, 2, 1, 4};
        System.out.println("Sum of first two elements in {8, 2, 1, 4}: " + sumFirstTwoElements(arr3)); 

        int[] arr4 = {7};
        System.out.println("Sum of first two elements in {7}: " + sumFirstTwoElements(arr4));     
        int[] arr5 = {};
        System.out.println("Sum of first two elements in {}: " + sumFirstTwoElements(arr5));      

        int[] arr6 = null;
        System.out.println("Sum of first two elements in null: " + sumFirstTwoElements(arr6)); 
    }
}