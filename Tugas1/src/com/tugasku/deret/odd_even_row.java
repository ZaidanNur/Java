package com.tugasku.deret;

import java.util.Scanner;

public class odd_even_row {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah : ");
        int user_input = sc.nextInt();
        int num = 0;

        // Membuat baris bilangan genap sebanyak inputan user
        System.out.print("Baris genap : ");
        for (int count = 1; count <= user_input; count++) {
            if ((num % 2 == 0)) {
                System.out.print(num + " ");
            } else {
                count--;
            }
            num++;
        }

        // Membuat baris bilangan ganjil sebanyak inputan user
        num = 0;
        System.out.println();
        System.out.print("Baris ganjil : ");
        for (int count1 = 1; count1 <= user_input; count1++) {
            if ((num % 2 != 0) ) {
                System.out.print(num + " ");
            } else {
                count1--;
            }
            num++;
        }
    }
}
