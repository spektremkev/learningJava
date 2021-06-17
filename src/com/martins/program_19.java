package com.martins;


import java.util.Scanner;

public class program_19 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("incira um numero inteiro:");
        int numero = input.nextInt();

        if ( numero % 2 != 0 )
            System.out.println("Teste impar");

        if ( numero % 2 == 0 ){
            System.out.println("Teste impar");
        }

        if((numero % 2 == 0) || (numero < 20)){
            System.out.println("OK");
        }

    }
}
