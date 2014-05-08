/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.Scanner;

/**
 *
 * @author Navin Bhatia at Northeastern University, navinbhatia85@gmail.com
 */
public class MultpliesOf3And5 {
    
    private static long timeForComputation;
    public static void main(String[] args){        
        Scanner input = new Scanner(System.in);
        double sum = 0;
        
        System.out.println("Enter the maximum number");
        //Taking the max count from the user
        int max = Integer.valueOf(input.nextLine());        
        System.out.println("Enter the first divisor");
        int firstDivisor = Integer.valueOf(input.nextLine());
        sum += sumOfMultiples(firstDivisor, max);
        System.out.println("Enter the second divisor");
        int secondDivisor = Integer.valueOf(input.nextLine());
        sum += sumOfMultiples(secondDivisor, max);
        
        //Now i subtract the LCM and its multiples since they would be added twice
        sum -= sumOfMultiples((firstDivisor * secondDivisor), max);
        System.out.println("The total sum of multiples is : " + sum);
        System.out.println("Time Elapsedin computation in nanoseconds"
                + " is: " + timeForComputation);
        
    }
    
    private static double sumOfMultiples(int divisor, int max){
        MyUtils.startTimer();
        /*So now we find the highest possible multiple for the input
         , add all of the multiples.
           We can run a for loop for that, but since it is an arithmetic
           progression we can use the formula to obtain it
           Sum = numberOfTerms/2(divisor + highestMultiple)*/
        int numberOfTerms = (max - 1)/divisor;
        int highestMultiple = numberOfTerms * divisor;
        timeForComputation += MyUtils.getElapsedTime();
        return (numberOfTerms/2.0 * (divisor + highestMultiple));
    }
    
}
