package com.epam.mara.fundamentals;

import java.util.Scanner;

public class OptionalTask1_1 {
    public static void main(String[] args) {
        System.out.println("Ввести n чисел с консоли. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество чисел:");
        final int quantity = scan.nextInt();

        int numbers[] = new int[quantity];
        System.out.println("Введите " + quantity + " чисел:");
        for (int i = 0; i < quantity; i++) {
            numbers[i] = scan.nextInt();
        }

        int max = 0;
        int min = numbers[0];

        for (int i = 0; i < quantity; i++) {
            if (Math.abs(numbers[i]) > Math.abs(max)) {
                max = numbers[i];
            } else if (Math.abs(numbers[i]) < Math.abs(min)) {
                min = numbers[i];
            }
        }

        System.out.println("Shortest number: " + min + ", length: " + String.valueOf(Math.abs(min)).length());
        System.out.println("Longest number: " + max + ", length: " + String.valueOf(Math.abs(max)).length());
    }
}
