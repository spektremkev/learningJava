package com.martins;

import java.util.Scanner;

public class program_25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero de 0 a 10:");
        int numero = input.nextInt();

        for (int i = 0; i <= 10; ++i) {

            if (i == numero) {
                System.out.println("O seu numero é " + i);
            } else {
                System.out.println("O seu numero não é " + i);
                continue;
            }

            System.out.println("XXXXXXXXX");

        }

    }


}
