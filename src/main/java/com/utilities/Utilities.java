package com.utilities;

public class Utilities {
    public static int add(int a, int b) {
        return a + b;
    }

    public static String checkEvenOrOdd(int number) {
        return number % 2 == 0 ? "EVEN" : "ODD";
    }

    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static String getDayOfWeek(int day) {
        return switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day";
        };
    }
}
