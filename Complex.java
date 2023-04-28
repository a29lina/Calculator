package org.example;

public class Complex {
    double x;
    double y;
    double i = Math.sqrt(-1);
    private double newX;
    private double newY;
    Complex newComp;


    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Complex addition(Complex otherComp){
        newX = x + otherComp.getX();
        newY = y + otherComp.getY();
        newComp = new Complex(newX, newY);
        return newComp;
    }

    public Complex substraction(Complex otherComp){
        newX = x - otherComp.getX();
        newY = y - otherComp.getY();
        newComp = new Complex(newX, newY);
        return newComp;
    }

    public Complex multiplication(Complex otherNumber){
        newX = (x * otherNumber.getX()) - (y * otherNumber.getY());
        newY = (y * otherNumber.getX()) + (x * otherNumber.getY());
        newComp = new Complex(newX, newY);
        return newComp;
    }

    public Complex division(Complex otherNumber) {
        newX = ((x * otherNumber.getX()) + (y * otherNumber.getY())) / ((otherNumber.getX() *
                otherNumber.getX()) + (otherNumber.getY() * otherNumber.getY()));
        newY = ((y * otherNumber.getX()) - (x * otherNumber.getY())) / ((otherNumber.getX() *
                otherNumber.getX()) + (otherNumber.getY() * otherNumber.getY()));
        newComp = new Complex(newX, newY);
        return newComp;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getI() {
        return i;
    }


    @Override
    public String toString() {
        return  x + " + " + y + "i";
    }
}
