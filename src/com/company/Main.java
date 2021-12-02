package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("What is your Age?");
        Scanner input = new Scanner(System.in);
        int age  = input.nextInt();
        if(age>18){
            System.out.println("yayy you are old enough!");
        }else{
            System.out.println("oops! sorry.");
        }


    }
}
