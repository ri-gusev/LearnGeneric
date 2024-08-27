import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasketTest {

    Basket<Fruit> fruits = new Basket<>();
    Basket<Orange> oranges = new Basket<>();
    Basket<Apple> apples = new Basket<>();

    @Before
    public void setUp(){
        for (int i = 0; i < 10; i++) {
            fruits.add(new Apple());
            oranges.add(new Orange());
            apples.add(new Apple());
        }
    }

    @Test
    public void addTest(){
        assertEquals(10, fruits.size());
        assertEquals(10, apples.size());
        assertEquals(10, oranges.size());
     }

    @Test
    public void getWeightTest(){
        double resultApples = apples.getWeight();
        double resultOranges = oranges.getWeight();
        double resultFruits = apples.getWeight();

        assertEquals(10,resultApples,0.001);
        assertEquals(10,resultFruits,0.001);
        assertEquals(15,resultOranges,0.001);
     }

    @Test
    public void CompareToTest(){
        double res1 = fruits.compare(apples);
        double res2 = fruits.compare(oranges);
        double res3 = oranges.compare(apples);

        assertEquals(0, res1, 0.001);
        assertEquals(-1, res2, 0.001);
        assertEquals(1, res3, 0.001);
    }

    @Test
    public void transferTest(){
        Basket<Apple> apples2 = new Basket<>(); //0 // 10
        Basket<Fruit> fruits2 = new Basket<>(); // 0 //15

        Basket.transfer(apples, apples2);
        Basket.transfer(oranges,fruits2);

        assertEquals(10,fruits2.size());
        assertEquals(0,oranges.size());
        assertEquals(10, apples2.size());
        assertEquals(0,apples.size());
    }

}