package com.martins;

public class program_31 {

    public static void main(String[] args) {

        int i;
        int [] x  = new int[10];

    /*
    for ( i=0; i< x.length; ++i ){
        x[i]=50;
    }
    */

        java.util.Arrays.fill(x,3);

        for ( i=0; i< x.length; ++i ){
            System.out.println(x[i]);
        }

    }

}
