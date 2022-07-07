package com.company;
import java.sql.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Compare {
    public static boolean arrayEqual(int[] a, int[] b) {
        boolean trueOrFalse = true;
        if (a.length != b.length) {
            return false;
        }
        else{
            for(int i = 0;i < a.length; i++){
                if(a[i] != b[i]){
                    System.out.println("The Arrays are not equal!");
                    return false;

                }

            }
            System.out.println("The Arrays are equal!");
            return  true;
        }
    }
}