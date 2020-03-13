package com.company.variables;

public class Task8 {
    public static void main(String[] args) {
        int oneShirt = 2500;
        int numberShirts = 2;
        int discountShirts = 3;
        int shirtDifference = discountShirts-numberShirts;
        int allPriceShirts = oneShirt * numberShirts;
        System.out.println("Цена одной рубашки " + oneShirt);
        System.out.println("Колличество выбранных рубашек " + numberShirts);
        System.out.println("Колличество рубашек которые, необходимо купить " + discountShirts);
        System.out.println("Колличество рубашек, которые надо купить, чтобы получить скидку " + shirtDifference);
        System.out.println("Общая цена уже выбранных рубашек " + allPriceShirts);
    }
}
