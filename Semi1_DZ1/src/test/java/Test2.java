import org.example.Task2;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Test2 {
    @Test
    public void findMaxTrue() {
        int max = 5;
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 10));
        assertEquals(max, Task2.findMax(list), "Максимум найдет не верно");
    }

    @Test
    public void checkLength() {
        int minLenght = 3;
        List<String> list = new ArrayList<>(Arrays.asList("111", "2222", "3", "1011"));
        List<String> resalt = Task2.filterStrings(list, minLenght);
        assertEquals(list, resalt, "Есть слова меньшей длины");
    }
}
