package com.codegyan.arrays;

public class Six_num {
	public static boolean firstLast6(int[] nums) {
	      
        if (nums.length >= 1) {

  		  return (nums[0] == 6 || nums[nums.length - 1] == 6);
        }

        return false;

		}
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 6}; 
        int[] arr2 = {6, 2, 3, 4}; 
        int[] arr3 = {6};          
        int[] arr4 = {};          

        System.out.println("arr1: " + firstLast6(arr1));
        System.out.println("arr2: " + firstLast6(arr2));
        System.out.println("arr3: " + firstLast6(arr3));
        System.out.println("arr4: " + firstLast6(arr4));

	}

}
