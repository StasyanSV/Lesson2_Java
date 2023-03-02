package org.example.lesson2.hw1;

import java.util.Scanner;
/*
Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class Zdn1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] myArray = new int[n];
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scan.nextInt();
            if (Prost(myArray[i]) == true){
                sum += myArray[i];
            }
        }


        System.out.println(sum);
    }

    public static boolean Prost(int a){

        for (int i = 2; i < a; i++) {
            if (a % i == 0 && i != a){
                return false;
            }
        }
        return true;
    }
}
