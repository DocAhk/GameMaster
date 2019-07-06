package tools;

import java.util.Random;

public class Dice
{
    private Random rng;

    private int sides;

    public Dice(int sides)
    {
        rng = new Random();
        this.sides = sides;
    }

    public int getSides()
    {
        return sides;
    }

    public Dice()
    {
       rng = new Random();
       this.sides = 6;
    }

    public int roll()
    {
        return rng.nextInt(sides) + 1;
    }
}
