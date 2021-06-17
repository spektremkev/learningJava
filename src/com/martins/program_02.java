package com.martins;

import java.util.Scanner;

public class program_02 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //System.out.println();

        System.out.println("Tape it your name complete");
            String name = input.next();

        System.out.println("Your name is" + name);

        System.out.println("Tape it your frist name");
        String name1 = input.next();

        System.out.println("Tape it your lastname");
        String name2 = input.next();

        System.out.println(name1 + name2);
    }
}
