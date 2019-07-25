package logic;

public class Check
{
    int roll;
    int requiredRoll;

    public Check (int roll, int requiredRoll)
    {
        this.roll = roll;
        this.requiredRoll = requiredRoll;
    }

    public boolean checkPassed()
    {
        return roll > requiredRoll;
    }

    public int getRoll()
    {
        return roll;
    }

    public void setRoll(int roll)
    {
        this.roll = roll;
    }

    public int getRequiredRoll()
    {
        return requiredRoll;
    }

    public void setRequiredRoll(int requiredRoll)
    {
        this.requiredRoll = requiredRoll;
    }
}
