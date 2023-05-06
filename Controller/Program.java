package org.example.Controller;

import org.example.Model.Complex;
import org.example.Model.Rational;
import org.example.View.Menu;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;


public class Program {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Program.class.getName());
        FileHandler fh = new FileHandler("log.xml", true);
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        Scanner iScanner = new Scanner(System.in);

        Menu m1 = new Menu();

        try {

            Menu.menuGeneral();
            char var = iScanner.next().charAt(0);

            if (var == '1') {
                Menu.menuRational();
                char x = iScanner.next().charAt(0);
                System.out.printf("Введите первое число: ");
                Rational a1 = new Rational(iScanner.nextDouble());
                System.out.printf("Введите второе число: ");
                Rational a2 = new Rational(iScanner.nextDouble());

                switch (x) {
                    case ('1'):
                        a1.addition(a2.getX());
                        break;
                    case ('2'):
                        a1.subtraction(a2.getX());
                        break;
                    case ('3'):
                        a1.multiplication(a2.getX());
                        break;
                    case ('4'):
                        a1.division(a2.getX());
                        break;
                    case ('5'):
                        a1.power(a2.getX());
                        break;
                    default:
                        System.out.println("Нет такого варианта в меню!");
                }
            }

            else if (var == '2') {
                Menu.menuComplex();
                char x = iScanner.next().charAt(0);

                System.out.println("Введите X для первого комплексного числа : ");
                double x1 = iScanner.next().charAt(0);
                System.out.println("Введите Y для первого комплексного числа : ");
                double y1 = iScanner.next().charAt(0);
                Complex a = new Complex(x1, y1);

                System.out.println("Введите X для второго комплексного числа : ");
                double x2 = iScanner.next().charAt(0);
                System.out.println("Введите Y для второго комплексного числа : ");
                double y2 = iScanner.next().charAt(0);
                Complex b = new Complex(x1, y1);

                switch (x) {
                    case ('1'):
                        a.additionComp(b);
                        break;
                    case ('2'):
                        a.subtractionComp(b);
                        break;
                    case ('3'):
                        a.multiplicationComp(b);
                        break;
                    case ('4'):
                        a.divisionComp(b);
                        break;
                    default:
                        System.out.println("Нет такого варианта в меню!");
                }
            }
            else {
                System.out.println("Нет такого варианта в меню!");
            }
            logger.log(Level.INFO, "Everything is fine");
        } catch (Exception e) {
            logger.log(Level.WARNING, "!!!");
        }
    }
}