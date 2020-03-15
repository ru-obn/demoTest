package com.company.variables;

public class DownPayment {
    public static void main(String[] args) {
        final int apartmentCost = 5_000_000;
        final double downPaymentPercent = 25.0;
        final double downPayment = (apartmentCost * downPaymentPercent) / 100;
        System.out.println("Стоимость квартиры равна " + apartmentCost);
        System.out.println("Первоначальный взнос равен " + downPaymentPercent + "%");
        System.out.println("Сумма первоначального взноса равна " + downPayment);
    }
}
