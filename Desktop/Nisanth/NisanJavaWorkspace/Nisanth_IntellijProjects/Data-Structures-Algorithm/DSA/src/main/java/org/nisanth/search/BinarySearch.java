package org.nisanth.search;

public class BinarySearch { // Time complexity - O(log n)
    public static void main(String[] args)
    {

        int nums[]={1,2,3,4,5,6,7,8,9,10,11,12};
        int target=12;
        int left,right,mid;
        int result=-1;
         left=0;

         right=nums.length-1;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(nums[mid]==target)
            {
               result=mid;
               break;
            }
            else if(nums[mid]<target)
            {
                 left=mid+1;
            }
            else
            {
                right=mid-1;
            }

        }
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
