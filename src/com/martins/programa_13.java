package com.martins;

public class programa_13 {

    public static void main(String[] args) {

        long totalMilisegundos = System.currentTimeMillis();

        long totalSegundos = totalMilisegundos / 100;
        long segundoAtual = totalSegundos % 60;

        long totalMinutos = totalSegundos / 60;
        long minutoAtual = totalMinutos % 60;

        long totalHora = totalMinutos / 60;
        long horaAtual = totalHora % 24;

        System.out.println(totalSegundos);
        System.out.println(segundoAtual);
        System.out.println(totalMinutos);
        System.out.println(minutoAtual);
        System.out.println(totalHora);
        System.out.println(horaAtual);


    }
}
