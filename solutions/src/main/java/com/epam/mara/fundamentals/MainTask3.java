package com.epam.mara.fundamentals;

import java.util.Random;
import java.util.Scanner;

public class MainTask3 {
    public static void main(String[] args) {
        System.out.println("Вывести заданное количество случайных чисел с переходом и без перехода на новую строку\n");

        Scanner input = new Scanner(System.in);
        Random randomizer = new Random();

        int num;
        boolean line_flag;

        System.out.print("Введите количество чисел:");
        int quantity = input.nextInt();

        for (int i = 0;  i< quantity; i++) {
            num = randomizer.nextInt();
            System.out.print(num + ",");

            line_flag = randomizer.nextBoolean();
            if (line_flag) {
                System.out.print("\n");
            }
        }
    }
}
