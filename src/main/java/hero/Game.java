package hero;

public class Game
{
    public boolean check(int roll, int requiredRoll)
    {
        if(roll >= requiredRoll)
            return true;
        else
            return false;
    }
}
