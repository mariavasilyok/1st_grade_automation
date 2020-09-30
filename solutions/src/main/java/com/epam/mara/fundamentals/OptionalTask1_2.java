package com.epam.mara.fundamentals;

import java.util.Scanner;

public class OptionalTask1_2 {
    public static void main(String[] args) {
        System.out.println("Ввести n чисел с консоли. Вывести числа в порядке возрастания (убывания) значений их длины.\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество чисел:");
        final int quantity = scan.nextInt();

        int numbers[] = new int[quantity];
        System.out.println("Введите " + quantity + " чисел:");
        for (int i = 0; i < quantity; i++) {
            numbers[i] = scan.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < (numbers.length - 1); j++) {
                if (Math.abs(numbers[j]) > Math.abs(numbers[j+1])) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < quantity; i++) {
            System.out.print(numbers[i]);
            if (i < quantity - 1) {
                System.out.print(", ");
            }
        }
    }
}
