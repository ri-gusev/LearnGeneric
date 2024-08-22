import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void TestBox(){
        Box<String, Integer, Float> box1 = new Box<>("string", 2, 3.5f);
        Box<String,Integer, Float> box2 = new Box<>("string", 5, 6.5f);

        float actual = box1.getValue1() + box2.getValue1() + box1.getValue2() + box2.getValue2();

        assertEquals(17, actual,0.001);

    }


}