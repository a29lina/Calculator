package org.example;

public class Rational {
    double a;

    public Rational(double a) {
        this.a = a;
    }

    public double getRational() {
        return a;
    }

    public void setRational(double a) {
        this.a = a;
    }

    static double divison(double a, double b) {
        double div = a/b;
        return div;
    }

    static double multiplication(double a, double b) {
        return a * b;
    }

    static double addition(double a, double b) {
        return a + b;
    }

    static double substraction(double a , double b){
        return a - b;
    }

}
