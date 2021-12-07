package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] rolls = new int[5];
//
//        for (int i=0; i<rolls.length; i++){
//            rolls[i] = i+1;
//        }
//
//        for (int i=0; i<rolls.length; i++){
//            System.out.println(rolls[i]);
//        }
//        String[] arr = new String[5];
//        System.out.println(arr[0]);
          Scanner in = new Scanner(System.in);

//          int[] arr = new int[4];
//          for (int i=0; i < arr.length; i++){
//              arr[i] = in.nextInt();
//          }
//          for (int i=0; i < arr.length; i++){
//              System.out.println(arr[i]);
//          }

//        for (int i: arr) {
//            System.out.println(i);
//        }
        String[] str = new String[5];
        for (int i=0; i< str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }

}
