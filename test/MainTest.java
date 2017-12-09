import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("StringA");
        stringList.add("StringB");
        stringList.add("StringB");
        stringList.add("StringC");
        stringList.add("StringA");
        stringList.add("StringC");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("StringA");
        expected.add("StringB");
        expected.add("StringC");

        assertEquals("Failed to calculate correct compounded value", expected, Main.removeDuplicates(stringList));
    }

}