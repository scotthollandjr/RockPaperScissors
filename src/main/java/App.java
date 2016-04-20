import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {

  public static void main(String[] arg) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String,Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      RockPaperScissors rpsGame = new RockPaperScissors();
      ArrayList<Object> resultsArray = rpsGame.runRockPaperScissors();
      Object[] stringArray = resultsArray.toArray();
      Object player1 = stringArray[0];
      Object player2 = stringArray[1];
      Object winner = stringArray[2];

      model.put("player1", player1);
      model.put("player2", player2);
      model.put("winner", winner);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
