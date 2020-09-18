package com.epam.mara;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MainTask1
{
    public static void main( String[] args )
    {
        System.out.println( "Приветствовать любого пользователя при вводе его имени через командную строку." );

        String username;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите своё имя:");
        username = input.nextLine();
        System.out.println("Hello, " + username);
    }
}
