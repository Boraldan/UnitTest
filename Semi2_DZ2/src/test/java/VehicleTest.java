import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import ru.boraldan.spring.*;

class VehicleTest {

    public static Car car;
    public static Motorcycle moto;

    @BeforeAll
    public static void createUsers() {
        car = new Car("BMW", "X5", 2023);
        moto = new Motorcycle("Suzuki", "S10", 2020);
    }

    @Test
    public void testVechicleTrue(){
        assertTrue(car instanceof Vehicle);
      }


    @Test
    public void testCarWheeleCounter(){
        int x = 4;
        assertEquals(x, car.getNumWheels());
    }

    @Test
    public void testMotoWheeleCounter(){
        int x = 2;
        assertEquals(x, moto.getNumWheels());
    }

    @Test
    public void testCarSpeed(){
        int testSpeed = 60;
        car.testDrive();
        if(car.getSpeed() < 0) { throw new IllegalArgumentException("Спидомент поломался");}
        assertEquals(testSpeed, car.getSpeed() );
        }

    @Test
    public void testMotoSpeed(){
        int testSpeed = 75;
        moto.testDrive();
        if(moto.getSpeed() < 0) { throw new IllegalArgumentException("Спидомент поломался");}
        assertEquals(testSpeed, moto.getSpeed() );
    }

    @Test
    public void getSpeed(){
        System.out.println(car.getSpeed());
    }
    @Test
    public void testCarParking(){
        int testSpeed = 0;
        car.testDrive();
        car.park();
        if(car.getSpeed() < 0) { throw new IllegalArgumentException("Спидомент поломался");}
        assertEquals(testSpeed, car.getSpeed() );
    }

    @Test
    public void testMotoParking(){
        int testSpeed = 0;
        moto.testDrive();
        moto.park();
        if(moto.getSpeed() < 0) { throw new IllegalArgumentException("Спидомент поломался");}
        assertEquals(testSpeed, moto.getSpeed() );
    }




    }


