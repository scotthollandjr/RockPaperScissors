import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void runRockPaperScissors_containsOneRPSValue_true() {
    RockPaperScissors testRPS = new RockPaperScissors();
    Boolean expected = ((testRPS.runRockPaperScissors().contains("rock")) || (testRPS.runRockPaperScissors().contains("paper")) || (testRPS.runRockPaperScissors().contains("scissors")));
    assertTrue(expected);
  }

  @Test
  public void runRockPaperScissors_containsTwoRPSValue_true() {
    RockPaperScissors testRPS = new RockPaperScissors();
    Object[] testArray = testRPS.runRockPaperScissors().toArray();

    Boolean expected = ( ( (testArray[0] == "rock") || (testArray[0] == "paper") || (testArray[0] =="scissors") ) && ( (testArray[1] == "rock") || (testArray[1] == "paper") || (testArray[1] =="scissors") ) );
  }

  // @Test
  // public void runRockPaperScissors_RPSValuesBeatEachother_true() {
  //
  // }

}
