import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.e1.PlanetFinder;

class PlanetFinderTest {
    private void doTest(int id, String expected) {
      String actual = PlanetFinder.getPlanetName(id);
      assertEquals(expected, actual, "for id = " + id);
    }

    @Test
    void exampleTests() {
      doTest(2, "Venus");
      doTest(5, "Jupiter");
      doTest(3, "Earth");
    }
}
