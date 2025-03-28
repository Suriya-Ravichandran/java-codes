package com.jspider.curdoperation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        int num;

        // Start of the loop
        while (true) {
            System.out.println("ENTER 1 TO INSERT\n2 TO UPDATE\n3 TO DELETE\n4 TO SELECT\n5 TO EXIT\n");
            num = scn.nextInt();
            switch (num) {
                case 1:
                    curdFunctions.insert();
                    break;
                case 2:
                    curdFunctions.update();
                    break;
                case 3:
                    curdFunctions.delete();
                    break;
                case 4:
                    curdFunctions.select();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return; // Exit the program
                default:
                    System.out.println("Make a correct choice...!");
            }
        }
    }
}
