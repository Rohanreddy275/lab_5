
package com.mycompany.lab_5;

import com.mycompany.lab_5.*;
import java.util.Arrays;

public class array {
    
    int getTotal(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        sum = sum + array[i];
        return sum;
        }

    double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        sum = sum + array[i];
        return sum / array.length;
    }

    int getHighest(int[] array) {
    Arrays.sort(array);
    return array[array.length - 1];
    }

    int getLowest(int[] array) {
    Arrays.sort(array);
    return array[0];
    }
    
    public static void main(String[] args) {
    int[] array = { 3, 5, 6, 9, 1, 4, 7, 33, 22 };
    array aa = new array();
    System.out.println("Total : " + aa.getTotal(array));
    System.out.println("Average : " + aa.getAverage(array));
    System.out.println("Highest : " + aa.getHighest(array));
    System.out.println("Lowest : " + aa.getLowest(array));
    }
}