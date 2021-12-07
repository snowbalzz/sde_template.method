package com.hz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Printer printer = new Console();
        Card card = null;

        System.out.println("\nWhich Card to send? Input number.\n" +
                "1 - Regular\n" +
                "2 - Graduation");

        int choice = Integer.parseInt(reader.readLine());
        //Create Card Graduation
        if (choice == 1){
            card = new PostCardGraduation(printer);
        } else if (choice == 2){
            card = new RegularGreating(printer);
        }

        //Prints card out
        card.print();
    }
}
