/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorthingalgorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author seryozha
 */
public class SorthingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        System.out.println("Enter number of elements");
 
        int array[] = new int[in.nextInt()];
 
        System.out.println("Enter " + array.length + " integers");
 
        for (int i = 0; i < array.length; i++) {
           array[i] = in.nextInt();
        }
        
        new BubbleSort().bubble(array);
        
        System.out.println("Sorted  array:\t" + Arrays.toString(array));
    }
    
}
