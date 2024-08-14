package org.nisanth.sorting;

public class QuickSort { // Time complexity - O(n log n)
    public static void quickSort(int nums[],int low,int high)
    {

        // quick call itself
        if(low<high)
        {
            int pi=partition(nums,low,high);
           quickSort(nums,low,pi-1); // divide and conquer
           quickSort(nums,pi+1,high);
        }
    }


    private static int partition(int[] nums,int low,int high)
    {
       int pivot=nums[high]; // last element
        int i=low-1; // -1
        for(int j=low;j<high;j++)
        {
            if(nums[j]<pivot)
            {
                i++;
                int temp=nums[i];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
        int temp=nums[i+1];
        nums[i+1]=nums[high];
        nums[high]=temp;

        return i+1; // pi

    }
    public static void main(String[] args)
    {
        int nums[]={7,3,4,2,1,8,9,10};
        System.out.println("Before Sorting");
        for(int num:nums)
        {
            System.out.print(num +" ");
        }

        quickSort(nums,0,nums.length-1);


        System.out.println();

        System.out.println("After Sorting");
        for(int num:nums)
        {
            System.out.print(num+" ");
        }
    }
}
