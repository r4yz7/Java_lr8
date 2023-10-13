package org.example;

public class Televisor {
    String model;
    int year;
    double price;
    double diagonal;
    String firm;

    public Televisor(String model, int year, double price, double diagonal, String firm) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.diagonal = diagonal;
        this.firm = firm;
    }

    @Override
    public String toString() {
        return "Firm: " + this.firm + "\nModel: " + this.model + "\nYear: " + year + "\nPrice: " + price + "\nDiagonal: " + diagonal + "\n";
    }
}
