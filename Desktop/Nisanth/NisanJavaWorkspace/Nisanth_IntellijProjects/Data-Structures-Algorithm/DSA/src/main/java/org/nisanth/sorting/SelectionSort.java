package org.nisanth.sorting;

public class SelectionSort { // Time complexity - O(n^2) Quadratic Time complexity
    public static void main(String[] args)
    {
        int nums[]={6,5,2,8,9,4};
        int size=nums.length;
        int temp=0;
        int minIndex=-1;
        System.out.println("Before Sorting");
        for(int num:nums)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.print("Iterations");

        // Only outer itself we sort it is good
        for(int i=0;i<size-1;i++)
        {
            minIndex=i;
            // in every iteration we can skip first element because it is sorted
            for(int j=i+1;j<size;j++)
            {
                 if (nums[minIndex]>nums[j]) // 6>5
                 {
                     minIndex=j; // here get a min value
                 }
            }
            // outer loop we had to swap a value i.e 6 and 2
            temp=nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;
            System.out.println();
            for(int num:nums)
            {
                System.out.print(num+" ");
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
