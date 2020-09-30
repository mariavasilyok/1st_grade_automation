package com.epam.mara.fundamentals;

import java.util.Scanner;

public class MainTask5 {
    public static void main(String[] args) {
        System.out.println("Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел\n");

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Введите номер месяца (число от 1 до 12):");
            int month = scan.nextInt();

            if (month > 0 && month <= 12) {
                switch (month) {
                    case 1: {
                        System.out.println("Январь");
                        break;
                    }
                    case 2: {
                        System.out.println("Февраль");
                        break;
                    }
                    case 3: {
                        System.out.println("Март");
                        break;
                    }
                    case 4: {
                        System.out.println("Апрель");
                        break;
                    }
                    case 5: {
                        System.out.println("Май");
                        break;
                    }
                    case 6: {
                        System.out.println("Июнь");
                        break;
                    }
                    case 7: {
                        System.out.println("Июль");
                        break;
                    }
                    case 8: {
                        System.out.println("Август");
                        break;
                    }
                    case 9: {
                        System.out.println("Сентябрь");
                        break;
                    }
                    case 10: {
                        System.out.println("Октябрь");
                        break;
                    }
                    case 11: {
                        System.out.println("Ноябрь");
                        break;
                    }
                    case 12: {
                        System.out.println("Декабрь");
                        break;
                    }
                }
            } else {
                System.out.println("Неверное число! Попробуйте еще раз.");
            }
        }
    }
}
