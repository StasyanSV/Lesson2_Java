package org.example.lesson2.cw1;

import java.util.Scanner;

/*
Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
 */
public class Zdn3 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] mass = new int[n];

        for (int i = 0; i < n; i++) {
            mass[i] = scan.nextInt();
        }
        scan.close();

        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] == 2 * mass[i+1]){
                count++;
            }
        }

        System.out.println(count);


    }
}
