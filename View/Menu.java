package org.example.View;

import org.example.Model.Rational;

import java.util.Scanner;

public class Menu {

    Scanner iScanner = new Scanner(System.in);
    public static void menuGeneral(){
        System.out.println("Для работы с рациональными числами введите 1");
        System.out.println("Для работы с комплексными числами введите 2");
    }

    public static void menuRational(){
        System.out.println("Если хотите использовать сложение, введите 1");
        System.out.println("Если хотите использовать вычитание, введите 2");
        System.out.println("Если хотите использовать умножение, введите 3");
        System.out.println("Если хотите использовать деление, введите 4");
        System.out.println("Если хотите возвести в степень, введите 5");
    }

    public static void menuComplex(){
        System.out.println("Если хотите использовать сложение, введите 1");
        System.out.println("Если хотите использовать вычитание, введите 2");
        System.out.println("Если хотите использовать умножение, введите 3");
        System.out.println("Если хотите использовать деление, введите 4");
    }

}
