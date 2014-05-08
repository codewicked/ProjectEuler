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
public class XPrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Xth prime number you wish to see");
        //Taking the max count from the user
        int Xth = Integer.valueOf(input.nextLine()); 
        MyUtils.startTimer();
        //to find the 1001st prime number, i would have two variables
        //currentPrime and primeCount        
        int currentPrime = 2;
        int primeCount = 1;
        int currentOdd = 3;
        while (primeCount < Xth) {
            if (isPrime(currentOdd)) {
                currentPrime = currentOdd;
                primeCount++;
            }
            currentOdd += 2;
        }
        System.out.println("The prime number at position " + Xth + 
                " is: " + currentPrime);
        System.out.println("Time Elapsed in computation "
                + "in milliSeconds is " + MyUtils.getElapsedTime()/1000000);
    }

    private static boolean isPrime(int currentOdd) {
        for (int i = 3; i * i <= currentOdd; i += 2) {
            if (currentOdd % i == 0) {
                return false;
            }
        }
        return true;
    }
}
