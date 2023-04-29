package org.example;

public class Rational extends Calculator {
    double a;

    double newNumber;
    double otherNumber;


    public Rational(double a) {
        this.a = a;
    }

    public double getRational() {
       return a;
    }


    public void setRational(double a) {
        this.a = a;
    }

    @Override
    public void addition(double otherNumber) {
        newNumber = a + otherNumber;
        System.out.println(newNumber);
    }

    @Override
    public void additionComp(Complex otherComp) {
    }

    @Override
    public void subtraction(double otherNumber) {
        newNumber = a - otherNumber;
        System.out.println(newNumber);
    }

    @Override
    public void division(double otherNumber) {
        newNumber = a / otherNumber;
        System.out.println(newNumber);
    }

    @Override
    public void subtractionComp(Complex otherComp) {
    }

    @Override
    public void multiplication(double otherNumber) {
        newNumber = a * otherNumber;
        System.out.println(newNumber);
    }

    @Override
    public void divisionComp(Complex otherComp) {
    }

    @Override
    public void multiplicationComp(Complex otherComp) {
    }
}
