package com.epam.mara.fundamentals;

import java.util.Scanner;

public class OptionalTask1_6 {
    public static void main(String[] args) {
        System.out.println("Ввести n чисел с консоли. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество чисел:");
        final int quantity = scan.nextInt();

        Integer numbers[] = new Integer[quantity];
        System.out.println("Введите " + quantity + " чисел:");
        for (int i = 0; i < quantity; i++) {
            numbers[i] = scan.nextInt();
        }
        Integer abs;
        String numbersStr[] = new String[quantity];
        for (int i = 0; i < quantity; i++) {
            abs = Math.abs(numbers[i]);
            numbersStr[i] = abs.toString();
        }

        boolean condition = false;
        String tmp;

        for (int i = 0; i < quantity; i++) {
            for (int j = 0; j < (numbersStr[i].length() - 1); j++) {
                tmp = numbersStr[i];
                if (tmp.charAt(j+1) > tmp.charAt(j)) {
                    condition = true;
                } else {
                    condition = false;
                    break;
                }
            }

            if (condition) {
                System.out.println(numbers[i]);
                break; // если нужно вывести все подходщие под условие числа, убрать break
            }
        }
    }
}
