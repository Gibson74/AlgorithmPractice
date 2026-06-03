package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class insertionSort.java {
    public static void main(String[] args) {
        int[] nums = {5, 2, 4, 6, 1, 3};
        int n = nums.length;
        System.out.print("size of " + n + "\nPre-sort: ");
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i]);
        }
        System.out.println("\n");
        //Insertion sort here

        //here i is set to the second value of the array
        /**
         * Initialization stop: loop holds at initial point, when i = 1. Subarray only has nums[0] in it and is sorted.
         * Therefore, loop invariant holds before first iteration happens
         */
        /**
         * Maintenance step: Each iteration holds loop invariant. This is shown, as at the end of each iteration,
         * the sorted array of nums[n - 1] stays sorted.
         */
        /**
        for(int i = 1; i < n; i++){
            key = nums[i];
            //j = sorted subarray?
            j = i - 1;
            while(j >= 0 && nums[j] > key){
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
         **/

        /**
         * Termination step: Full array is sorted at the end of the loops, and nums[n-1] encompasses the full array.
         */
        int[] results = decreasingInsertionSort();
        int[] results2 = increasingInsertionSort();
        System.out.println(Arrays.toString(results));
        System.out.println(Arrays.toString(results2));
        System.out.print("Post-sort: ");
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i]);
        }

    }

    public static int[] increasingInsertionSort(){
        int[] nums = {5, 2, 4, 6, 1, 3};
        int n = nums.length;
        int key;
        int j;
        for(int i = 1; i < n; i++){
            key = nums[i];
            //j = sorted subarray?
            j = i - 1;
            while(j >= 0 && nums[j] > key){
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
        return nums;
    }
    public static int[] decreasingInsertionSort(){
        int[] nums = {5, 2, 4, 6, 1, 3};
        int n = nums.length;
        int key;
        int j;
        for(int i = 1; i < n; i++){
            key = nums[i];
            //j = sorted subarray?
            j = i - 1;
            while(j >= 0 && nums[j] < key){
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
        return nums;
    }
}
