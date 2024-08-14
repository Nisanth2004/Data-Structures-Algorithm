package org.nisanth.sorting;

public class BuubleSort { // Time complexity - O(n^2) Quadratic Time complexity
    public static void main(String[] args)
    {
        int nums[]={6,5,2,8,9,4,89,6,0,43};
        int size=nums.length;
        int temp=0;
        System.out.println("Before Sorting");
        for(int num:nums)
        {
            System.out.print(num +" ");
        }




        // outer loop is no of iterations
        for(int i=0;i<size;i++)
        {
            // actual swaping
            for(int j=0;j<size-i-1;j++)
            {
                // comapre two values and sort
                if(nums[j]>nums[j+1])
                {
                    // if first value is greater than other value it is swap
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                System.out.println();
                for(int num:nums)
                {
                    System.out.print(num+" ");
                }
            }
        }

        System.out.println();

        System.out.println("After Sorting");
        for(int num:nums)
        {
            System.out.print(num+" ");
        }
    }
}
