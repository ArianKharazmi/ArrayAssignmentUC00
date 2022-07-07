package com.company;
import java.sql.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of First Array");
        int input = scanner.nextInt();
        System.out.println("Size of Second Array");
        int input2 = scanner.nextInt();
        Compare compare = new Compare();
        int[] a = new int[input];
        int[] b = new int[input2];
        System.out.println(compare.arrayEqual(a,b));
    }
}