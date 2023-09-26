package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyTest {
    private int a = 2;
    private int b = 5;

    @Test
    public void testAddition() {
        int result = add(a, b);
        // Проверяем, что результат сложения равен ожидаемому значению (8)
        assertEquals(8, result, "Сумма неверна");
    }

    @Test
    public void testDivision() {
        int dividend = 10;
        int divisor = 2;
        // Проверяем, что деление выполняется без остатка
        assertTrue(dividend % divisor == 0, "Деление с остатком");
    }

    private int add(int a, int b) {
        return a + b;
    }
}
