package com.martins;

import java.util.Scanner;

public class program_34 {
    public static void main(String[] args) {

        final int TOTAL_ALUNOS = 4;
        final int TOTAL_BIMESTRES = 4;
        final double NOTA_MININA = 70.0;

        Scanner input = new Scanner(System.in);
        String[]nomeAlunos = new String[TOTAL_ALUNOS];

        double[][]notaAluno = new double [TOTAL_ALUNOS][TOTAL_BIMESTRES];
        double[]mediaAluno = new double [TOTAL_ALUNOS];

        for (int i = 0; i < TOTAL_ALUNOS; ++i){
            System.out.println("Informe o nome do " +(i+1) + "aluno ");
            nomeAlunos[i] = input.nextLine();
        }
        System.out.println();

        for (int i = 0; i < TOTAL_ALUNOS; ++i){
            for (int j = 0; i < TOTAL_BIMESTRES; ++j){
                System.out.println("Informe a nota dos aluno " + nomeAlunos[i]+
                        "para o " + (j + i) + "bimestre ");
                notaAluno[i][j]= input.nextDouble();
            }
        }
        for (int i = 0; i < TOTAL_ALUNOS; ++i){
            for (int j = 0; i < TOTAL_BIMESTRES; ++j){

            }
        }
    }
}
