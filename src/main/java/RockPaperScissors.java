import java.util.Random;
import java.util.ArrayList;

public class RockPaperScissors {

  public ArrayList<Object> runRockPaperScissors() {
    ArrayList<Object> arrayRPS = new ArrayList<Object>();
    Random randomGenerator = new Random();
    Integer playerOne = randomGenerator.nextInt(3);
    Integer playerTwo = randomGenerator.nextInt(3);
    ArrayList<Integer> playerArray = new ArrayList<Integer>();
    playerArray.add(playerOne);
    playerArray.add(playerTwo);

    for (Integer player : playerArray) {
      if ( player == 0 ) {
        arrayRPS.add("rock");
      } else if ( player == 1 ) {
        arrayRPS.add("paper");
      } else {
        arrayRPS.add("scissors");
      }
    }

    if (playerOne == playerTwo) {
      arrayRPS.add("Tie game!");
    } else if (playerOne == 0) {
        if (playerOne + playerTwo == 1) {
          arrayRPS.add("Player 2 wins!");
        } else {
          arrayRPS.add("Player 1 wins!");
        }
    } else if (playerOne == 1) {
        if (playerOne + playerTwo == 3) {
          arrayRPS.add("Player 2 wins!");
        } else {
          arrayRPS.add("Player 1 wins!");
        }
    } else if (playerOne == 2) {
        if (playerOne + playerTwo == 2) {
          arrayRPS.add("Player 2 wins!");
        } else {
          arrayRPS.add("Player 1 wins!");
        }
      } return arrayRPS;
  }
}

// results[] = ["rock", "scissors", "player 2 wins"]
// hashmap of rock paper scissors being 0 1 2
