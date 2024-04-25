import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FunctionsTest {
    @Test
    public void testThatCanGetNumberOfCharacters(){
        List<String>  listOfStrings = new ArrayList<>();
        listOfStrings.add("java");
        listOfStrings.add("python");
        int expected = 10;
        assertEquals(expected,LambdaFunctions.countCharactersInAListOfStrings(listOfStrings));

    }
    @Test
            public void testThatCanGetUserName() {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Abby");
        listOfNames.add("Uye");
       String expected = "Abby";
       String name = LambdaFunctions.createUsers(listOfNames).get(0).getName();
        assertEquals(expected, name);

    }

    @Test
    public void testThatCanGetUserAge() {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Abby");
        listOfNames.add("Uye");
        int expected = 4;
        int age = LambdaFunctions.createUsers(listOfNames).get(0).getAge();
        assertEquals(expected, age);

    }

}
