package com.martins;

import java.util.Scanner;

public class program_17 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = input.nextLine();

        System.out.println("Qual sua idade?");
        int idade = input.nextInt();

        //---------------------------------------------------------------
        if(idade < 18 ){
            System.out.println("Teste menor ");
        }

        if(idade <= 18 ){
            System.out.println("Teste menor igual ");
        }

        if(idade > 18 ){
            System.out.println("Teste maior  idade");
        }

        if(idade >= 18 ){
            System.out.println("Teste maior igaul" + " idade");
        }

        if(idade == 18 ){
            System.out.println("Teste igual idade");
        }
        //---------------------------------------------------------------
        if(idade < 1 ){
            System.out.println(nome + "Sua idade não e valida.");
        }else if(idade < 18){
            System.out.println(nome + "Voce e menor de idade.");
        }else {
            System.out.println(nome + "Voce e maior de idade.");
        }



    }
}
