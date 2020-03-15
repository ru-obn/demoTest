package com.company.variables;

public class AgeUnivers {
    public static void main(String[] args) {
        final long ageUnivers = 13_000_000_000L;
        final int agePeopple = 100_000;
        final long ageDifference = ageUnivers / agePeopple;
        System.out.println("Возраст вселенной " + ageUnivers + " лет.");
        System.out.println("Возраст человечества " + agePeopple + " лет.");
        System.out.println("Вселенная старше человечества в " + ageDifference + " раз.");
    }
}