package org.example;

public class Complex extends Calculator{

    private double newX;
    private double newY;
    Complex newComp;

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return  x + " + " + y + "i";
    }


    public void additionComp(Complex otherComp) {
        newX = x + otherComp.getX();
        newY = y + otherComp.getY();
        newComp = new Complex(newX, newY);
        System.out.println(newComp);
    }


    public void subtractionComp(Complex otherComp) {
        newX = x - otherComp.getX();
        newY = y - otherComp.getY();
        newComp = new Complex(newX, newY);
        System.out.println(newComp);
    }


    public void divisionComp(Complex otherComp) {
        newX = ((x * otherComp.getX()) + (y * otherComp.getY())) / ((otherComp.getX() *
                otherComp.getX()) + (otherComp.getY() * otherComp.getY()));
        newY = ((y * otherComp.getX()) - (x * otherComp.getY())) / ((otherComp.getX() *
                otherComp.getX()) + (otherComp.getY() * otherComp.getY()));
        newComp = new Complex(newX, newY);
        System.out.println(newComp);
    }


    public void multiplicationComp(Complex otherComp) {
        newX = (x * otherComp.getX()) - (y * otherComp.getY());
        newY = (y * otherComp.getX()) + (x * otherComp.getY());
        newComp = new Complex(newX, newY);
        System.out.println(newComp);
    }
}
