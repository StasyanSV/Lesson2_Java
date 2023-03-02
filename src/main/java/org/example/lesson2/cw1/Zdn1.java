package org.example.lesson2.cw1;

import java.util.Scanner;

/*
Реализуйте pow(x, n) , который вычисляет xв степени n(т.е. ).xn
 */
public class Zdn1 {
    public static void main(String[] args) {
        double x;
        int n;
        Scanner scan = new Scanner(System.in);
        x = scan.nextDouble();
        n = scan.nextInt();
        scan.close();
        double res = 1;
        if(n < 0) {
            x = 1 / x;
            n *= -1;
        }
        for (int i = 0; i < n; i++) {
            res *= x;
        }
        System.out.println("result = " + res);
    }
}
