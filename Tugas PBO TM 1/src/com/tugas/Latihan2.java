package com.tugas;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int input_nilai = sc.nextInt();

        System.out.print("Nilai kamu : ");
        if(input_nilai>80){
            System.out.println("A");
        } else if ( input_nilai>=70){
            System.out.println("B");
        } else if (input_nilai>=60){
            System.out.println("C");
        } else if (input_nilai >=50){
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}
