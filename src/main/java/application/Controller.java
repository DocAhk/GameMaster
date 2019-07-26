package application;

import logic.Dice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "${cross.origin}")
@RestController
public class Controller {

    private Dice die = new Dice(20);

    @GetMapping(path="/diceRoll")
    public int diceRoll(@RequestParam(value="sides", defaultValue="20") int sides) {
        die.setSides(sides);
        return die.roll();
    }

}
