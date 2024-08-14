package org.nisanth.search;

public class LinearSearch { // Time complexity - O(n) O(1)
    public static void main(String[] args)
    {
        int nums[]={4,5,7,6,3,1};
        int target=90;
        int index=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                 index=i;
            }
            else {
                System.out.println("Element not found:"+i);
            }

        }
        System.out.println("Element found at index: "+index);




    }


}
