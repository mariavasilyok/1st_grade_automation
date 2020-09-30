package com.epam.mara.fundamentals;

import java.util.Random;
import java.util.Scanner;

public class MainTask4 {
    public static void main(String[] args) {
        System.out.println("Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль\n");

        Scanner scan = new Scanner(System.in);
        Random randomizer = new Random();
        int num;
        int sum = 0;
        int compose = 1;

        System.out.println("Введите количество чисел:");
        int quant = scan.nextInt();

        for (int i = 0; i < quant; i++) {
            num = randomizer.nextInt(20);   //считается ли выпадение 0 ошибкой?
            System.out.println(num);

            sum += num;
            compose *= num;
        }

        System.out.println("Summ = " + sum + "; Composition = " + compose);
    }
}
