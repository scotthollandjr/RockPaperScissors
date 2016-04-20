import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void runRockPaperScissors_returnInteger_Integer() {
    RockPaperScissors testRPS = new RockPaperScissors();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add("rock");
    assertEquals(expected, testRPS.runRockPaperScissors());
  }
}

// we expect runRockPaperScissors to return a random integer between 0 and 3
