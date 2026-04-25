/*
 * Nama : Rahmi Aulia
 * NIM  : 2501083021
 * Desk :
*/
package com.mycompany.praktikum23042026;

/**
 *
 * @author Rahmi Aulia
 */
public class MainLine {
    public static void main(String[] args) {
        Line l1 = new Line(1, 2, 4, 6);

        System.out.println("Line: " + l1);
        System.out.println("Panjang: " + l1.getLength());

        l1.setBeginXY(3, 3);
        System.out.println("Setelah ubah begin: " + l1);

        l1.setEndXY(7, 8);
        System.out.println("Setelah ubah end: " + l1);

        int[] begin = l1.getBeginXY();
        int[] end = l1.getEndXY();

        System.out.println("Begin: (" + begin[0] + "," + begin[1] + ")");
        System.out.println("End: (" + end[0] + "," + end[1] + ")");
    }
}
