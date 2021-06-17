package com.martins;

import java.util.Scanner;

public class program_30 {


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int numAlunos = 5;

        double[] notaAlunos = new double[numAlunos];

        for(int i = 0; i < numAlunos; ++i){
            System.out.println("Insira a nota do " + (i+1) + "° aluno.");
            notaAlunos[i] = input.nextDouble();
        }

        for(int i = 0; i < numAlunos; ++i){
            System.out.println("-> " + notaAlunos[i]);
        }

    }


}
