package com.company.variables;

public class Glass {
    public static void main(String[] args) {
        final int glass = 250;
        final double volumePercent = 55.25;
        final double filledGlass = (glass * volumePercent )/ 100;
        System.out.println("Объем в стакане равен " + glass + "мл.");
        System.out.println("Стакан заполнен на " + volumePercent + "%");
        System.out.println("Стакан заполнен на " + filledGlass + "мл.");
    }
}
