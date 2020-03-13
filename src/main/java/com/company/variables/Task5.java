package com.company.variables;

public class Task5 {
    public static void main(String[] args) {
        long ageUnivers = 13_000_000_000L;
        int agePeopple = 100_000;
        long ageDifference = ageUnivers / agePeopple;
        System.out.println("Возраст вселенной " + ageUnivers + " лет.");
        System.out.println("Возраст человечества " + agePeopple + " лет.");
        System.out.println("Вселенная старше человечества в " + ageDifference + " раз.");
    }
}