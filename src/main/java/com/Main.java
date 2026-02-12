package com;

import java.util.Scanner;

import com.utilities.Utilities;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.print("""
                     ===== STUDENT UTILITY APP =====
                     1. Add two numbers
                     2. Check if a number is EVEN or ODD
                     3. Print numbers from 1 to N
                     4. Display day of the week
                     5. Exit
                    \s
                     Enter your choice:\s
                    """);

            String input = sc.nextLine();

            switch (input) {
                case "1":
                    int a = readInt(sc, "Enter first number: ");
                    int b = readInt(sc, "Enter second number: ");
                    System.out.println("Sum: " + Utilities.add(a, b));
                    break;

                case "2":
                    int number = readInt(sc, "Enter a number: ");
                    System.out.println(number + " is " + Utilities.checkEvenOrOdd(number));
                    break;

                case "3":
                    int n = readInt(sc, "Enter N: ");
                    Utilities.printNumbers(n);
                    break;

                case "4":
                    int day = readInt(sc, "Enter day number (1-7): ");
                    System.out.println(Utilities.getDayOfWeek(day));
                    break;

                case "5":
                    System.out.println("Thank you for using the app");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();

            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a whole number (e.g., 1, 2, 3, 4).");
            }
        }
    }
}
