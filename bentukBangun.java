/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author Lamhot
 */
import java.util.Scanner;

public class bentukBangun {

    public static void main(String[] args) {

        int option = 0;

        while (option != 3) {

            System.out.println("Parallelogram and Retangle Simulation");
            System.out.println("_____________________________________");
            System.out.println("");
            System.out.println("1. Rectangle");
            System.out.println("2. Parallelogram");
            System.out.println("3. Exit");
            option = readValidInt("Insert your choice", 1, 3);

            if (option == 1) {
                pritRetangle();
            } else if (option == 2) {
                pritParallelogram();
            }

        }
    }

    public static int readValidInt(String label, int min, int max) {
        Scanner input = new Scanner(System.in);
        int in = 0;
        while (!((in >= min) && (in <= max))) {
            System.out.print(label + "[" + min + ".." + max + "] : ");
            try {
                in = input.nextInt();
            } catch (Exception e) {
                input.nextLine();
            }
        }
        return in;
    }

    public static void pritRetangle() {
        int width = readValidInt("Insert width", 3, 9);
        int height = readValidInt("Insert height", 3, 9);

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

    public static void pritParallelogram() {
        int width = readValidInt("Insert width", 3, 9);
        int height = readValidInt("Insert height", 3, 9);

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= (width - i) + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
