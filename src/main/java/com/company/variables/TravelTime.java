package com.company.variables;

public class TravelTime {
    public static void main(String[] args) {
        final int distance = 120;
        final double speed = 80;
        final double time = distance/speed;
        final double coefficient = 1.75;
        final double timeOffice = time * coefficient;
        System.out.println("Расстояние от дома до офиса равно " + distance + " километров.");
        System.out.println("Средняя скорость такси " + speed + "км.");
        System.out.println("Время за которое добирается домой " + time + " часа");
        System.out.println("Коэффициент замедления траспорта " + coefficient);
        System.out.println("Время за которое тестировщик добирается от дома до офиса " + timeOffice + " часа");
    }
}
