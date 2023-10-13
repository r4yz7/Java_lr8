package org.example;

public class Car {
    String mark;
    int year;
    double price;
    String color;
    double V;

    public Car(String mark, int year, String color, double v,double price) {
        this.mark = mark;
        this.year = year;
        this.color = color;
        V = v;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mark: " + this.mark +"\nPrice: " + this.price + "\nYear: " + this.year + "\nColor: " + this.color + "\nEngine capacity: " + this.V + "\n";
    }
}
