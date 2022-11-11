/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs102assignment07;

/**
 *
 * @author jehuv
 */
public class MergeSort {
    public static int[] sortInts(int[] inputArray)
    {
        if(inputArray.length == 1)
        {
            return inputArray;
        }
        else
        {
            int subdivideIndex = inputArray.length / 2;
            int[] firstHalf = new int[subdivideIndex];
            int[] secondHalf = new int[inputArray.length - subdivideIndex];
            for(int i = 0; i < subdivideIndex; i++)
            {
                firstHalf[i] = inputArray[i];
            }
            for(int i = subdivideIndex; i < inputArray.length; i++)
            {
                secondHalf[i - subdivideIndex] = inputArray[i];
            }
            int[] newFirstArray = sortInts(firstHalf);
            int[] newSecondArray = sortInts(secondHalf);
            int[] mergedArray = new int[inputArray.length];
            int firstIndex = 0;
            int secondIndex = 0;
            for(int i = 0; i < mergedArray.length; i++)
            {
                if(newFirstArray[firstIndex] < newSecondArray[secondIndex])
                {
                    mergedArray[i] = newFirstArray[firstIndex];
                    firstIndex++;
                    if(firstIndex == newFirstArray.length)
                    {
                        i++;
                        while(i < mergedArray.length)
                        {
                            mergedArray[i] = newSecondArray[secondIndex];
                            secondIndex++;
                            i++;
                        }
                    }
                }
                else
                {
                    mergedArray[i] = newSecondArray[secondIndex];
                    secondIndex++;
                    if(secondIndex == newSecondArray.length)
                    {
                        i++;
                        while(i < mergedArray.length)
                        {
                            mergedArray[i] = newFirstArray[firstIndex];
                            firstIndex++;
                            i++;
                        }
                    }
                }
            }
            return mergedArray;
        }
    }
}
