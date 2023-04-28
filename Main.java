package org.example;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;


public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("log.xml", true);
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        Scanner iScanner = new Scanner(System.in);

        try {

            System.out.println("Для работы с рациональными числами введите 1");
            System.out.println("Для работы с комплексными числами введите 2");
            char var = iScanner.next().charAt(0);

            if (var == '1') {
                System.out.println("Если хотите использовать сложение, введите 1");
                System.out.println("Если хотите использовать вычитание, введите 2");
                System.out.println("Если хотите использовать умножение, введите 3");
                System.out.println("Если хотите использовать деление, введите 4");

                char x = iScanner.next().charAt(0);
                System.out.printf("Введите первое число: ");
                Rational a1 = new Rational(iScanner.nextDouble());
                System.out.printf("Введите второе число: ");
                Rational a2 = new Rational(iScanner.nextDouble());

                switch (x) {
                    case ('1'):
                        System.out.println(Rational.addition(a1.getRational(), a2.getRational()));
                        break;
                    case ('2'):
                        System.out.println(Rational.substraction(a1.getRational(), a2.getRational()));
                        break;
                    case ('3'):
                        System.out.println(Rational.multiplication(a1.getRational(), a2.getRational()));
                        break;
                    case ('4'):
                        System.out.println(Rational.divison(a1.getRational(), a2.getRational()));
                        break;
                }
            }

            if (var == '2') {
                System.out.println("Если хотите использовать сложение, введите 1");
                System.out.println("Если хотите использовать вычитание, введите 2");
                System.out.println("Если хотите использовать умножение, введите 3");
                System.out.println("Если хотите использовать деление, введите 4");
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
                        System.out.println("result = " + a.addition(b));
                        break;
                    case ('2'):
                        System.out.println("result = " + a.substraction(b));
                        break;
                    case ('3'):
                        System.out.println("result = " + a.multiplication(b));
                        break;
                    case ('4'):
                        System.out.println("result = " + a.division(b));
                        break;
                }
            }
            logger.log(Level.INFO, "Everything is fine");
        } catch (Exception e) {
            logger.log(Level.WARNING, "!!!");
        }

    }
}