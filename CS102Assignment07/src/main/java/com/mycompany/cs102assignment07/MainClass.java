/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cs102assignment07;

/**
 *
 * @author jehuv
 */
public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int[] arrayToSort = {5, 3, 17, 9, 8, 4, 13, 15, 12, 19, 21, 11};
        System.out.println("Here is the sorted array:");
        int[] sortedArray = MergeSort.sortInts(arrayToSort);
        for(int i = 0; i < arrayToSort.length; i++)
        {
            System.out.println(sortedArray[i]);
        }
        for(int n = 0; n < 6; n++)
        {
            System.out.println("To solve the Tower of Hanoi with 4 pegs and " + n + " disks, you'll need " + TowerOfHanoi.moveCount(n) + " moves.");
        }
    }
}
