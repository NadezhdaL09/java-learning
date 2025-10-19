package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* int selector = 500;

        switch (selector) {
            case 500:
                System.out.println("Internal server error");
                break;
            case 404:
                System.out.println("Not found");
                break;
            case 401:
                System.out.println("Unathorized");
                break;
            default:
                System.out.println("Unknown error code");
                break;
        }  */

/*int a = 34;
int b = 347;
int c = 1;
if (c == 0) {
    System.out.println(" Остановка программы");
    return;
}

String result = a > b ? " a больше b" : "a не больше b";
System.out.println(a > b ? " a больше b" : "a не больше b");

 */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        switch (login) {
            case "qwerty":
                System.out.println("Недопустимая комбинация символов");
                break;
            case "admin":
                System.out.println("Введите пароль администратора:");
                if (scanner.nextLine().equals("admin")) {
                    System.out.println("Вы вошли как администратор");
                } else {
                    System.out.println("Неверный пароль администратора");
                }
                break;


        }
    }
}







