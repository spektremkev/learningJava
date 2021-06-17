package com.martins;

import java.util.Scanner;

public class programa_12 {


    public static void main(String[] args) {

        final double Pi = 3.1415926535;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor do raio");
        double raio = input.nextDouble();

        double area = raio*raio*Pi;

        System.out.println("arrea do circulo e  = " + area);


    }
}
