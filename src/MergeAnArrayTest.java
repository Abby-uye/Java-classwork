import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class MergeAnArrayTest {
    @Test
    public void testThatCanMergeAnArray(){
        int[] input = {4,5,8};
        int[] expected = {4,5,8,8,10,16};
        int[] actual = MergeAnArray.merge(input);

        assertArrayEquals(expected,actual);
    }
}
