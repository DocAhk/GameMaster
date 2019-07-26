package application;

import logic.Dice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Dice die = new Dice(20);

    @GetMapping("diceRoll")
    public int diceRoll(@RequestParam(value="sides", defaultValue="20") int sides) {
        die.setSides(sides);
        return die.roll();
    }

}
