//eate an array to hold the numbers 1-10.

package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main (String [] args) {
        int sum = 0;
        int counter = 0;
        int size;
        int values;
        int average = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter size of studets");
        int array[] = new int[scan.nextInt()];
        scan.nextLine();
        System.out.println("enter the score values");
        for (counter = 0; counter<array.length; counter++) {
//            while (counter != array.length) {
                values = scan.nextInt();
                sum += values;
            }
        average = sum/array.length;
        System.out.println("the score average is " + average);
//        int score =
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//            sum+= i;
//            System.out.printf("the numbers are %d \n", array[i]);
//        }
//        System.out.printf("The total sum is %d\n", sum);
    }
}