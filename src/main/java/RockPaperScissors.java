import java.util.Random;
import java.util.ArrayList;

public class RockPaperScissors {

  public ArrayList<Object> runRockPaperScissors() {
    ArrayList<Object> arrayRPS = new ArrayList<Object>();
    Random randomGenerator = new Random();
    // Integer playerOne = randomGenerator.nextInt(3);
    Integer playerOne = 0;

    if ( playerOne == 0 ) {
      arrayRPS.add("rock");
    } return arrayRPS;
  }
}

// results[] = ["rock", "scissors", "player 2 wins"]
// hashmap of rock paper scissors being 0 1 2
