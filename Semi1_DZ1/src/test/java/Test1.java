import org.example.Task1;
import org.junit.jupiter.api.Test;

public class Test1 {

    @Test
    public void checkDiscount(){
        double sum = 100;
        double res = Task1.calculatingDiscount(sum, 30);
        assert res == 71 : "Скидка считается неправильно";
    }
}
