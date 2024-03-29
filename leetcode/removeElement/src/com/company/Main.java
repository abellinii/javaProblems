package com.company;
import java.util.Stack;

//
//Given an array nums and a value val, remove all instances of that value in-place and return the new length.
//
//        Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//
//        The order of elements can be changed. It doesn't matter what you leave beyond the new length.
//
//        Example 1:
//
//        Given nums = [3,2,2,3], val = 3,
//
//        Your function should return length = 2, with the first two elements of nums being 2.
//
//        It doesn't matter what you leave beyond the returned length.





public class Main {

    public static void main(String[] args) {

        int[] arr = {3,2,2,3};
        int val = 3;

        removeElement(arr, val);

    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;  //set length
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){  //no match / if match no nothing and let it increment to next index
                nums[i] = nums[j];  //index = fast runner
                i++;      // add 1 to length
            }
        }

        return i;
    }