package com.tugas;

import java.util.Scanner;

public class Tugas {

    public static double area_of_circle(double radius){
        double phi = 3.14159265359;
        double area = phi*radius*radius;
      return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama : Zaidan Nur Muhammad Daffa");
        System.out.println("NIM : 202410101080 ");
        System.out.println("Kelas : Pemrograman Berorientasi Objek B");
        System.out.println();

        System.out.println("=================================");
        System.out.println("PROGRAM MENGHITUNG LUAS LINGKARAN");
        System.out.println("=================================");

        System.out.print("Masukkan jari-jari lingkaran : ");
        double radius = sc.nextDouble();
        System.out.println(String.format("Luas lingkaran : %.2f",area_of_circle(radius)));



    }

}
