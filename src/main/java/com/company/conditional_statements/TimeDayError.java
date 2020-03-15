package com.company.conditional_statements;

public class TimeDayError {
    public static void main(String[] args) {
        final int time = 2;
        final boolean morning = time >= 5 && time < 9;
        final boolean day = time >= 9 && time < 17;
        final boolean evening = time >= 17 && time < 21;
        final boolean night = time >= 21 && time < 24 || time >= 0 && time < 5;
        final boolean timeErrorMin = time <= -1;
        final boolean timeErrorMax = time >=24;
        if (morning) {
            System.out.println("утро");
        }
        if (day) {
            System.out.println("день");
        }
        if (evening) {
            System.out.println("вечер");
        }
        if (night) {
            System.out.println("ночь");
        }
        if (timeErrorMin){
            System.out.println("введите корректное время");
        }
        if (timeErrorMax){
            System.out.println("вернись с другой планеты");
        }
    }
}
