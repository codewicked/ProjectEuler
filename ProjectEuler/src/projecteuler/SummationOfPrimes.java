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
public class SummationOfPrimes {
    
    public static void main(String[] args){
        //Although we can use isPrime method from XPrimeNumber, 
        //I want to implement the Sieve of Eratosthenes
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the highest number");
        //Taking the max count from the user
        int max = Integer.valueOf(input.nextLine()); 
        MyUtils.startTimer();
        
        boolean[] arrayOfPrimes = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            arrayOfPrimes[i] = true;
        }
        for (int i = 2; i*i <= max; i++) {
            if (arrayOfPrimes[i]) {
                for (int j = i; i*j <= max; j++) {
                    arrayOfPrimes[i*j] = false;
                }
            }
        }
        int summation = 0;
        for (int i = 2; i <= max; i++) {
            if (arrayOfPrimes[i]) summation += i;
        }
        System.out.println("The sum of all the primes below " + max + " is: "
                + summation);
        System.out.println("Time Elapsed in computation "
                + "in milliSeconds is " + MyUtils.getElapsedTime()/1000000);
    }
    
}
