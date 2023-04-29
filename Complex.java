package org.example;

public class Complex extends Calculator{
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

    @Override
    public void addition(double otherNumber) {

    }

    @Override
    public void additionComp(Complex otherComp) {
        newX = x + otherComp.getX();
        newY = y + otherComp.getY();
        newComp = new Complex(newX, newY);
        System.out.println(newComp);
    }

    @Override
    public void subtraction(double otherNumber) {

    }

    @Override
    public void subtractionComp(Complex otherComp) {
        newX = x - otherComp.getX();
        newY = y - otherComp.getY();
        newComp = new Complex(newX, newY);
        System.out.println(newComp);
    }

    @Override
    public void division(double otherNumber) {

    }

    @Override
    public void divisionComp(Complex otherComp) {
        newX = ((x * otherComp.getX()) + (y * otherComp.getY())) / ((otherComp.getX() *
                otherComp.getX()) + (otherComp.getY() * otherComp.getY()));
        newY = ((y * otherComp.getX()) - (x * otherComp.getY())) / ((otherComp.getX() *
                otherComp.getX()) + (otherComp.getY() * otherComp.getY()));
        newComp = new Complex(newX, newY);
        System.out.println(newComp);
    }

    @Override
    public void multiplication(double otherNumber) {

    }

    @Override
    public void multiplicationComp(Complex otherComp) {
        newX = (x * otherComp.getX()) - (y * otherComp.getY());
        newY = (y * otherComp.getX()) + (x * otherComp.getY());
        newComp = new Complex(newX, newY);
        System.out.println(newComp);
    }
}
