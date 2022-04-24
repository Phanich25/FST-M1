package org.example;

public class Activity2 {
    public static void main(String[] args)
    {
        //Initialize an integer array.
        int intArray[] = {10, 77, 10, 54, -11, 10};
        //Initialize the count of 10's to 0.
        int count=0;
        //Loop through the array to find the number of 10's and to add the sum of 10's.
        for (int i : intArray)
            if(i==10) count+=10;
        //Check the total sum of 10's  in the given array is 30 or not.
        if(count==30)
            System.out.println("sum of all the 10's in the array is exactly 30.");
    }
}