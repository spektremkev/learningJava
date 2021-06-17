package com.martins;


import java.util.Scanner;

public class programa_16 {

    private static int y = 18;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String nome = input.nextLine();

        System.out.println("How old are you?");
        int idade = input.nextInt();


        if(idade < y ){
            System.out.println("you are underage");
        }

        if(idade <= y ){
            System.out.println("You are under the same age");
        }

        if(idade > y ){
            System.out.println("you are of legal age");
        }

        if(idade >= y ){
            System.out.println("you are bigger equal" + " ega");
        }

        if(idade == y ){
            System.out.println("you are the same age");
        }
    }

}
