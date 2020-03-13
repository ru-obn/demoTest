package com.company.variables;

public class Task3 {
    public static void main(String[] args) {
        int developer = 33;
        int tester = 2;
        int serviceDesk = 3;
        int totalTesters = developer * tester;
        int totalServiceDesk = serviceDesk * developer;
        int totalEmployees = developer + totalTesters + totalServiceDesk;
        System.out.println("Всего " + developer + " разработчиков.");
        System.out.println("Чтобы протестировать код одного разработчика, необходимо " + tester + " тестировщика.");
        System.out.println("Для обработки вопросов, возникающих у пользоватлей по поводу кода, написанного одним программистом, необходимо " + serviceDesk + " сотрудника поддержки.");
        System.out.println("Всего тестировщиков на проекте " + totalTesters + ".");
        System.out.println("Всего сотрудник SD на проекте " + totalServiceDesk + ".");
        System.out.println("Всего сотрудников на проекте " + totalEmployees);
    }
}
