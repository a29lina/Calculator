package org.example.Model;

public class Calculator {
    double x, y;
    double i = Math.sqrt(-1);
    double newNumber;

    public void addition(double otherNumber){
        newNumber = x + otherNumber;
        System.out.println("result = " + newNumber);
    };

    public void subtraction(double otherNumber){
        newNumber = x - otherNumber;
        System.out.println("result = " + newNumber);
    };

    public void division(double otherNumber){
        newNumber = x / otherNumber;
        System.out.println("result = " + newNumber);
    };

    public void multiplication(double otherNumber){
        newNumber = x * otherNumber;
        System.out.println("result = " + newNumber);
    };

    public void power(double otherNumber){
        newNumber = Math.pow(x, otherNumber);
        System.out.println("result = " + newNumber);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    protected double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getI() {
        return i;
    }

}
