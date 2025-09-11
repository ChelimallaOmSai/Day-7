package com.codegyan.arrays;

import java.util.Arrays;

public class maxNum {
	public static int[] maxEnd3(int[] nums) {
		  int largerValue;
		  if (nums[0] > nums[2]) {
		    largerValue = nums[0];
		  } else {
		    largerValue = nums[2];
		  }

		  nums[0] = largerValue;
		  nums[1] = largerValue;
		  nums[2] = largerValue;
		  return nums;
		}
	public static void main(String[] args) {
        System.out.println(Arrays.toString(maxEnd3(new int[]{1, 2, 3})));   // [3, 3, 3]
        System.out.println(Arrays.toString(maxEnd3(new int[]{11, 5, 9})));  // [11, 11, 11]
        System.out.println(Arrays.toString(maxEnd3(new int[]{2, 11, 20}))); // [20, 20, 20]

	}

}
