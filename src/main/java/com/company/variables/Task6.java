package com.company.variables;

public class Task6 {
    public static void main(String[] args) {
        int apartmentCost = 5_000_000;
        double downPaymentPercent = 25.0;
        double downPayment = (apartmentCost * downPaymentPercent) / 100;
        System.out.println("Стоимость квартиры равна " + apartmentCost);
        System.out.println("Первоначальный взнос равен " + downPaymentPercent + "%");
        System.out.println("Сумма первоначального взноса равна " + downPayment);
    }
}
