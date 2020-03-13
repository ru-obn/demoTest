package com.company.variables;

public class Task4 {
    public static void main(String[] args) {
        int glass = 250;
        double volumePercent = 55.25;
        double filledGlass = (glass * volumePercent )/ 100;
        System.out.println("Объем в стакане равен " + glass + "мл.");
        System.out.println("Стакан заполнен на " + volumePercent + "%");
        System.out.println("Стакан заполнен на " + filledGlass + "мл.");
    }
}
