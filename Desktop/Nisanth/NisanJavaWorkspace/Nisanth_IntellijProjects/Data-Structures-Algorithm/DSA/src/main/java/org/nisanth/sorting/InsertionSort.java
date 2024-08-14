package org.nisanth.sorting;

public class InsertionSort {
    public static void main(String[] args)
    {
        int nums[]={7,3,4,2,1,8,9,10};
        int size=nums.length;

        System.out.println("Before Sorting");
        for(int num:nums)
        {
            System.out.print(num +" ");
        }

        for(int i=1;i<size;i++)
        {
            int key=nums[i];
            int j=i-1;
            // for shifting
            while(j>=0 && nums[j]>key)
            {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }



        System.out.println();

        System.out.println("After Sorting");
        for(int num:nums)
        {
            System.out.print(num+" ");
        }
    }
}
