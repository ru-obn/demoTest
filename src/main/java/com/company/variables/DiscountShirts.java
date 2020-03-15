package com.company.variables;

public class DiscountShirts {
    public static void main(String[] args) {
        final int oneShirt = 2500;
        final int numberShirts = 2;
        final int discountShirts = 3;
        final int shirtDifference = discountShirts-numberShirts;
        final int allPriceShirts = oneShirt * numberShirts;
        System.out.println("Цена одной рубашки " + oneShirt);
        System.out.println("Колличество выбранных рубашек " + numberShirts);
        System.out.println("Колличество рубашек которые, необходимо купить " + discountShirts);
        System.out.println("Колличество рубашек, которые надо купить, чтобы получить скидку " + shirtDifference);
        System.out.println("Общая цена уже выбранных рубашек " + allPriceShirts);
    }
}
