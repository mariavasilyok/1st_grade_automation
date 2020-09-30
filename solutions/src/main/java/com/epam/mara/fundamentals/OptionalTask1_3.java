package com.epam.mara.fundamentals;

import java.util.Scanner;

public class OptionalTask1_3 {
    public static void main(String[] args) {
        System.out.println("Ввести n чисел с консоли. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество чисел:");
        final int quantity = scan.nextInt();

        Integer numbers[] = new Integer[quantity];
        System.out.println("Введите " + quantity + " чисел:");
        for (int i = 0; i < quantity; i++) {
            numbers[i] = scan.nextInt();
        }

        Integer lengths[] = new Integer[quantity];
        for (int i = 0; i < quantity; i++) {
            lengths[i] = numbers[i].toString().length();
            // нужно ли учитывать минус в длине отрицательного числа? если нет (т.е. длина числа -1 равна 1), то нужно добавить модуль:
            //lengths[i] = (Math.abs(numbers[i]));
            //lengths[i] = lengths[i].toString().length();
        }

        int averageLength = 0;
        for (int i = 0; i < quantity; i++) {
            averageLength += lengths[i];
        }
        averageLength /= quantity;
        System.out.println("Average length = " + averageLength);

        System.out.println("Numbers shorter than average:");
        for (int i = 0; i < quantity; i++) {
            if (lengths[i] < averageLength) {
                System.out.println(numbers[i] + ", length = " + lengths[i]);
            }
        }

        System.out.println("Numbers longer than average:");
        for (int i = 0; i < quantity; i++) {
            if (lengths[i] > averageLength) {
                System.out.println(numbers[i] + ", length = " + lengths[i]);
            }
        }
    }
}
