package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        int a = sc.nextInt();

        System.out.println("Введите второе число");
        int b = sc.nextInt();

        System.out.println("Введите арифметический символ");
        String s = sc.next();

        if (s.equals("+")) {
            int c = a + b;
            System.out.println("c = " + c);
        }
        if (s.equals("-")) {
            int c = a - b;
            System.out.println("c =  " + c);
        }
    }
}