package org.example.lesson2.hw1;
/*
Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
public class Zdn3 {
    public static void main(String[] args) {
        int [] myArray = new int[] {4,-5,34,-13,5,42,-5,-8,6,12,3,2};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] / 10 != 0) {
                sum += i;
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                myArray[i] = sum;
            }
            System.out.print(myArray[i] + " ");
        }
    }
}
