/*
    Упражнение 1.1
    Программа перевода галлонов в литры.
 */

public class GalToLit {
    public static void main(String[] args) {
        double gallons; // here we have gallons
        double liters;  // here we have liters

        gallons = 10;   // we have 10 gallons

        liters = gallons * 3.7854;  // we will get liters

        System.out.println(gallons + " галлонам соответствует " + liters + " литров");
        System.out.println();
        System.out.println("Did you know that?");

    }
}
