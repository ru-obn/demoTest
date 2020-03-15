package com.company.variables;

public class BuratinoAndApple {
    public static void main(String[] args) {
        int appleBuratino = 5;
        System.out.println("У Буратино " + appleBuratino + " яблок.");
        final int appleKarabas = 2;
        appleBuratino = appleBuratino - appleKarabas;
        System.out.println("Карабас Барабас отобрал у Буратино " + appleKarabas + " яблока.");
        System.out.println("У Буратино осталось " + appleBuratino + " яблока.");
    }
}
