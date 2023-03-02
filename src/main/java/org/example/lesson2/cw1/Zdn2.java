package org.example.lesson2.cw1;

import java.util.Scanner;

/*
Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
 */
public class Zdn2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num1 = scan.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            int num2 = scan.nextInt();
            if (num1 % 2 == 0 && num2 % 10 == 5){
                sum += num2;
            }
            num1 = num2;
        }
        scan.close();
        System.out.println(sum);
    }
}
