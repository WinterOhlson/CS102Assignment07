/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cs102assignment07;

/**
 *
 * @author jehuv
 */
public class TowerOfHanoi {
    public static int moveCount(int diskCount)
    {
        if(diskCount == -1)
        {
            return -1;
        }
        else if(diskCount == 0)
        {
            return 0;
        }
        else if(diskCount == 1)
        {
            return 1;
        }
        else
        {
            return 3 + 2 * moveCount(diskCount - 2);
        }
    }
}
