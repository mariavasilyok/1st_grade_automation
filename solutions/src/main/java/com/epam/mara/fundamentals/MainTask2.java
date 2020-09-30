package com.epam.mara.fundamentals;

import java.util.Scanner;

public class MainTask2 {
    public static void main(String[] args) {
        System.out.println("Отобразить в окне консоли аргументы командной строки в обратном порядке.\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество аргументов:");
        int quantity = input.nextInt();

        int [] arguments = new int[quantity];
        System.out.println("Введите " + quantity + " аргументов");

        for (int i = 0; i < quantity; i++) {
            arguments[i] = input.nextInt();
        }

        for (int i = quantity-1; i >= 0; i--) {
            System.out.print(arguments[i] + " ");
        }
    }
}
