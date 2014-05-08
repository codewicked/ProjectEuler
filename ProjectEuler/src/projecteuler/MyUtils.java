/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author Navin Bhatia at Northeastern University, navinbhatia85@gmail.com
 */
public class MyUtils {
    
    private static long startTime = System.nanoTime();
    public static void startTimer(){
        startTime = System.nanoTime();
    }
    
    public static long getElapsedTime(){
        return System.nanoTime() - startTime;
    }
}
