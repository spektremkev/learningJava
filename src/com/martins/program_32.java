package com.martins;

public class program_32 {
    public static void main(String[] args) {

        int vetor[] = {3,6,2,1,8,4};
        int aux;
        boolean controle;

        for(int i = 0; i < vetor.length; ++i )
        {
            controle = true;
            for(int j = 0; j < (vetor.length - 1); ++j )
            {

                if(vetor[j] > vetor[j + 1]){
                    aux = vetor[ j ];
                    vetor[ j ] =  vetor[j + 1];
                    vetor[j + 1] = aux;
                    controle = false;

                    //    System.out.println(vetor[i]+"if");
                }
                //  System.out.println(vetor[i]+"for 2");
            }
            if (controle){
                break;
            }
            //System.out.println(vetor[i]+"for 1");
        }
    }
}
