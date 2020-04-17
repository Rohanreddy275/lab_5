
package com.mycompany.lab_5;

import com.mycompany.lab_5.*;


public class TestScores {
   private double[] scores;
   double sum = 0;

   public TestScores(double array[]) {
      
       for (int i = 0; i < array.length; i++) {
           scores = new double[array.length];
        
           if (array[i] < 0 || array[i] > 100) {
        
               throw new IllegalArgumentException(
                      
                       "Bad scores" + i + array[i]);
           } else {
               
               scores[i] = array[i];
               sum += array[i];
           }
       }
   }

   public double getAverage() {
       return sum / scores.length;
   }
}


