import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void runRockPaperScissors_containsOneRPSValue_true() {
    RockPaperScissors testRPS = new RockPaperScissors();
    Boolean expected = ((testRPS.runRockPaperScissors().contains("Rock")) || (testRPS.runRockPaperScissors().contains("Paper")) || (testRPS.runRockPaperScissors().contains("Scissors")));
    assertTrue(expected);
  }

  @Test
  public void runRockPaperScissors_containsTwoRPSValue_true() {
    RockPaperScissors testRPS = new RockPaperScissors();
    Object[] testArray = testRPS.runRockPaperScissors().toArray();

    Boolean expected = ( ( (testArray[0] == "Rock") || (testArray[0] == "Paper") || (testArray[0] =="Scissors") ) && ( (testArray[1] == "Rock") || (testArray[1] == "Paper") || (testArray[1] =="Scissors") ) );
    assertTrue(expected);
  }

  @Test
  public void runRockPaperScissors_RPSValuesContainsWinner_true() {
    RockPaperScissors testRPS = new RockPaperScissors();
    Object[] testArray = testRPS.runRockPaperScissors().toArray();

    Boolean expected = ( (testArray[2] == "Tie game!") || (testArray[2] == "Player 1 wins!") || (testArray[2] == "Player 2 wins!") );
    assertTrue(expected);
  }

}
