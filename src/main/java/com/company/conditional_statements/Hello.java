package com.company.conditional_statements;

public class Hello {
    public static void main(String[] args) {
        final int time = 23;
        final int dayWeek = 5;
        final boolean dayWeek1 = dayWeek >= 1 && dayWeek <= 5 && time <= 8;
        final boolean dayWeek2 = dayWeek >= 1 && dayWeek <= 5 && time > 8 && time <= 11;
        final boolean dayWeek3 = dayWeek >= 1 && dayWeek <= 5 && time > 11 && time <= 23;
        final boolean dayWeek4 = dayWeek >= 6 && dayWeek <= 7 && time <= 12;
        final boolean dayWeek5 = dayWeek >= 6 && dayWeek <= 7 && time > 12 && time <= 16;
        final boolean dayWeek6 = dayWeek >= 6 && dayWeek <= 7 && time > 16 && time <= 18;
        final boolean dayWeek7 = dayWeek >= 6 && dayWeek <= 7 && time > 18 && time <= 23;

        if (dayWeek1 || dayWeek4) {
            System.out.println("Доброе утро!");
        }
        if (dayWeek2) {
            System.out.println("Все пропало ты проспал!");
        }
        if (dayWeek3) {
            System.out.println("Включай почту, составляй письмо, что сегодня берешь отгул.");
        }
        if (dayWeek5) {
            System.out.println("Лучше поспать еще.");
        }
        if (dayWeek6) {
            System.out.println("Вставай, тебя ждет недоигранный Ведьмак!");
        }
        if (dayWeek7) {
            System.out.println("Дааа, с режимом надо что-то делать.");
        }
    }
}
