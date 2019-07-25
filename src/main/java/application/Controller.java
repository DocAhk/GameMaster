package application;

import logic.Dice;


public class Controller {

    private Dice die = new Dice(20);

    public int diceRoll(int sides) {
        die.setSides(sides);
        return die.roll();
    }

    public int diceRoll() {
        return die.roll();
    }
}
