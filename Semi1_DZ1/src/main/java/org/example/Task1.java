package org.example;

public class Task1 {
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {

        if (purchaseAmount <= 0)
            throw new IllegalArgumentException("Сумма не должна быть меньше нуля");
        if (discountAmount < 0 || discountAmount > 100)
            throw new IllegalArgumentException("Скидка должна быть от 0 до 100%");
        return purchaseAmount * (1 - (double) discountAmount / 100);
    }
}
