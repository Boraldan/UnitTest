package task6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyClassTest {
    @Test
    public void sumListShouldBeCorrect() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> result = new ArrayList<>(Arrays.asList(2, 4, 6));
        List<Integer> resultTest = MyClass.sumLists(list1, list2);
        assertEquals(result, resultTest, "Сумма списков не верна!");
    }

    @Test
    public void findMaxTrue() {
        int max = 5;
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 10));
        assertEquals(max, MyClass.findMax(list), "Максимум найдет не верно");
    }

    @Test
    public void checkLength() {
        int minLenght = 3;
        List<String> list = new ArrayList<>(Arrays.asList("111", "2222", "3", "1011"));
        List<String> resalt = MyClass.filterStrings(list, minLenght);
        assertEquals(list, resalt, "Есть слова меньшей длины");
    }
}
