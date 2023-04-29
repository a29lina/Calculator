package org.example;

public class Calculator {
    double x, y;
    double i = Math.sqrt(-1);
    double newNumber;
    protected void addition(double otherNumber){
        newNumber = x + otherNumber;
        System.out.println(newNumber);
    };

    protected  void subtraction(double otherNumber){
        newNumber = x - otherNumber;
        System.out.println(newNumber);
    };

    protected  void division(double otherNumber){
        newNumber = x / otherNumber;
        System.out.println(newNumber);
    };

    protected  void multiplication(double otherNumber){
        newNumber = x * otherNumber;
        System.out.println(newNumber);
    };

    protected double getX() {
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
