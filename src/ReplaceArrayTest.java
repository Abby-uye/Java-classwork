import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReplaceArrayTest {
    @Test
    public void testThatCanReplaceArray(){
        int[] numbers = {4,5,8,8,8,2,9};
        boolean[] expected = {false,true,false,false,false,false,true};
        boolean[] actual = ReplaceArray.replace(numbers);
        assertArrayEquals(expected,actual);
    }
}
