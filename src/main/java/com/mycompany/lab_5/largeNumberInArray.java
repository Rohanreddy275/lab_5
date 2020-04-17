package com.mycompany.lab_5;

import com.mycompany.lab_5.*;


public class largeNumberInArray
{
  
public static void callMethod(int[] array,int n)
   {
   for(int i=0; i<array.length; i++)
   {
       if (array[i]>n)
           System.out.println(array[i]);
   }
   System.out.println();
}

  
   public static void main(String[] args)
   {
       int[] array1 = {2,6,18,2,4,-3};
       int num1=3;
       callMethod(array1,num1);
      
       int[] array2 = {9, 77, 23, 2};
       int num2 = 12;
       callMethod(array2, num2);
   }
}
