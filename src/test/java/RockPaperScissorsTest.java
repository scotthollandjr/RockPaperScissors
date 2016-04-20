import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void runRockPaperScissors_returnInteger_ArrayList() {
    RockPaperScissors testRPS = new RockPaperScissors();
    Boolean expected = ((testRPS.runRockPaperScissors().contains("rock")) || (testRPS.runRockPaperScissors().contains("paper")) || (testRPS.runRockPaperScissors().contains("scissors")));
    assertTrue(expected);
  }

  // @Test
  // public void
}

// we expect runRockPaperScissors to return a random integer between 0 and 3
