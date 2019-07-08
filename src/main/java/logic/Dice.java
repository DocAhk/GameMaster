package logic;

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

    public void setSides(int sides)
    {
        this.sides = sides;
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

    public int roll(int tempSides)
    {
        return rng.nextInt(tempSides) + 1;
    }
}
