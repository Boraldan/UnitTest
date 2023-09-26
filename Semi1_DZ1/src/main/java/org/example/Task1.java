package org.example;

public class Task1 {
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount <= 0) throw new ArithmeticException("Сумма не должна быть больше нуля");
        return purchaseAmount * (1 - (double) discountAmount / 100);
    }
}
