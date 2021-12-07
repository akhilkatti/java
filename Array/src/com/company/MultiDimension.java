package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {1,2,3},
                {2,4},
                {5,6,7,8}
        };

        int[][] arr2D = new int[3][2];

        for (int i = 0; i< arr2D.length; i++){
            for (int j = 0; j <arr2D[i].length; j++ ){
                arr2D[i][j] = in.nextInt();
            }
        }
//        for (int i = 0; i< arr2D.length; i++){
//            for (int j = 0; j <arr2D[i].length; j++ ){
//                System.out.println(arr2D[i][j]);
//            }
//        }
//        System.out.println(Arrays.toString(arr2D));

    }
}
