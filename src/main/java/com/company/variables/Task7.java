package com.company.variables;

public class Task7 {
    public static void main(String[] args) {
        int distance = 120;
        double speed = 80;
        double time = distance/speed;
        double coefficient = 1.75;
        double timeOffice = time * coefficient;
        System.out.println("Расстояние от дома до офиса равно " + distance + " километров.");
        System.out.println("Средняя скорость такси " + speed + "км.");
        System.out.println("Время за которое добирается домой " + time + " часа");
        System.out.println("Коэффициент замедления траспорта " + coefficient);
        System.out.println("Время за которое тестировщик добирается от дома до офиса " + timeOffice + " часа");
    }
}
