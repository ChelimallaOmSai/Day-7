package com.codegyan.arrays;
public class ArrayChecker {



    public static boolean sameFirstLast(int[] nums) {
      
        if (nums.length >= 1) {

            return nums[0] == nums[nums.length - 1];
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1}; 
        int[] arr2 = {1, 2, 3, 4}; 
        int[] arr3 = {7};          
        int[] arr4 = {};         
        int[] arr5 = {1, 1};     

        System.out.println("arr1: " + sameFirstLast(arr1));
        System.out.println("arr2: " + sameFirstLast(arr2));
        System.out.println("arr3: " + sameFirstLast(arr3));
        System.out.println("arr4: " + sameFirstLast(arr4));
        System.out.println("arr5: " + sameFirstLast(arr5));
    }
}