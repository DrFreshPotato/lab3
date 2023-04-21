import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StringCheck implements StringChecker {
    String filter;

    public StringCheck(String s) {
        filter = s;
    }

    public boolean checkString(String s) {
        if (s.contains(filter)) {
            return false;
        }
        return true;
    }
}

public class ListTests {
    @Test
    public void testFilter() {
        StringChecker sc = new StringCheck("e");
        List<String> input = new ArrayList<>(
                Arrays.asList("Apple", "Bottom", "Jeans", "Boots", "With", "The", "Fur"));
        assertEquals(new ArrayList<>(Arrays.asList("Bottom", "Boots", "With", "Fur")),
                ListExamples.filter(input, sc));
    }

    @Test
    public void testMerge() {
        List<String> input = new ArrayList<>(
                Arrays.asList("Apple", "Bottom", "Cat"));
        List<String> input2 = new ArrayList<>(
                Arrays.asList("Bottom", "Couch", "Dog"));
        assertEquals(new ArrayList<>(Arrays.asList("Apple", "Bottom", "Bottom", "Cat", "Couch", "Dog")),
                ListExamples.merge(input, input2));
    }
}