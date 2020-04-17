package com.mycompany.lab_5;

import com.mycompany.lab_5.*;


public class TestScoresDemo {
   public static void main(String[] args) throws Exception {
       
       double[] badScores = {75, 55,93, 101, 99};
       double[] goodScores = {97, 66, 88, 100, 99};
       TestScores testScore = null;
       // Start the try block.
       try {
           testScore = new TestScores(badScores);
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
       // Start the try block.
       try {
           testScore = new TestScores(goodScores);
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
      
       System.out.print("Good scores is" + testScore.getAverage());
   }  
}
