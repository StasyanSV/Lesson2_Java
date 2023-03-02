package org.example.lesson2.hw1;

import java.util.Scanner;

/*
Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
public class Zdn2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] myArray = new int[n];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scan.nextInt();
        }
        System.out.println(Posled(myArray));
    }

    public static boolean Posled(int [] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }
}
