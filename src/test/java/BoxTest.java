import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BoxTest{


    @Test
    public void getFirstElement() {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(i);
        }

        List<Object> array1 = new ArrayList<>();

        Box.transfer(array,array1);

        assertEquals(0,array.size());
        assertEquals(10,array1.size());

    }
}