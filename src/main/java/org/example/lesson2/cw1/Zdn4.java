package org.example.lesson2.cw1;

import java.io.PrintStream;

public class Zdn4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 3.0, 9.0);
        Vector vector2 = new Vector(3.0, 3.0, 3.0);
        System.out.println("lenght= " + vector1.length());
        PrintStream var10000 = System.out;
        double var10001 = vector1.vectorScal(vector2);
        var10000.println("scal= " + var10001);
        var10000 = System.out;
        Vector var3 = vector1.vectorProduct(vector2);
        var10000.println("vectorPr= " + var3);
        var10000 = System.out;
        var10001 = vector1.vectorCos(vector2);
        var10000.println("cos= " + var10001);
        var10000 = System.out;
        var3 = vector1.vectorSum(vector2);
        var10000.println("sum= " + var3);
        var10000 = System.out;
        var3 = vector1.vectorDiff(vector2);
        var10000.println("diff= " + var3);
    }
}
