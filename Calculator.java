package org.example;

public abstract class Calculator {
    protected abstract void addition(double otherNumber);
    protected abstract void additionComp(Complex otherComp);
    protected abstract void subtraction(double otherNumber);
    protected abstract void subtractionComp(Complex otherComp);
    protected abstract void division(double otherNumber);
    protected abstract void divisionComp(Complex otherComp);
    protected abstract void multiplication(double otherNumber);
    protected abstract void multiplicationComp(Complex otherComp);
}
