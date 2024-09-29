package org.example;

import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введwefrghyjukiите первое число:");
                int num1 = scanner.nextInt();
                if (num1 == 0) {
                    System.out.println("Калькулятор выключен");
                }
                else {
                    System.out.print("Введите второе число:");
                    int num2 = scanner.nextInt();

                    int res;
                    int res2;
                    int bun;

                    System.out.print("Введите знак:");
                    String action = scanner.nextLine();
                    action = scanner.nextLine();

                    switch (action) {
                        case "+":
                            res = num1 + num2;
                            System.out.println("Результат:" + res);
                            System.out.print("Продолжаем вычисление от полученного результата - Введите число:");
                            res2 = scanner.nextInt();
                            bun = res + res2;
                            System.out.println("Результат:" + bun);

                            break;

                        case "-":
                            res = num1 - num2;
                            System.out.println("Результат:" + res);
                            System.out.print("Продолжаем вычисление от полученного результата - Введите число:");
                            res2 = scanner.nextInt();
                            bun = res - res2;
                            System.out.println("Результат:" + bun);
                            break;
                        case "*":
                            res = num1 * num2;
                            System.out.println("Результат:" + res);
                            System.out.print("Продолжаем вычисление от полученного результата - Введите число:");
                            res2 = scanner.nextInt();
                            bun = res * res2;
                            System.out.println("Результат:" + bun);
                            break;
                        case "/":
                            res = num1 / num2;
                            System.out.println("Результат:" + res);
                            System.out.print("Продолжаем вычисление от полученного результата - Введите число:");
                            res2 = scanner.nextInt();
                            bun = res / res2;
                            System.out.println("Результат:" + bun);
                            break;
                        default:
                            System.out.println("Ошибка");

                    }
                }
                }
            }


