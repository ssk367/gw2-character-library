package com.v0397753.gw2;

import java.util.Scanner;;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt(scanner, "Choose an option: ");

            switch (choice) {
                case 1 -> System.out.println("TODO: Add character");
                case 2 -> System.out.println("TODO: List characters");
                case 3 -> System.out.println("TODO: View character");
                case 0 -> {
                    System.out.println("Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid option. Try again.");
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("=== GW2 Character Library ===");
        System.out.println("1) Add Character");
        System.out.println("2) List Characters");
        System.out.println("3) View Character");
        System.out.println("0) Exit");
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a number.");
            }
        }
    }
}
