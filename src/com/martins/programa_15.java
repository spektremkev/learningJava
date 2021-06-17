package com.martins;


import java.util.Scanner;

public class programa_15 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu primeiro nome?");
        String PrimeiroNome = input.next();

        System.out.println("Qual o seu ultimo nome?");
        String ultimoNome = input.next();

        System.out.println("Qual sua idade?");
        int idade = input.nextInt();

        System.out.println("Ola " + PrimeiroNome + " " + ultimoNome + " de " + idade + " anos");

    }
}
