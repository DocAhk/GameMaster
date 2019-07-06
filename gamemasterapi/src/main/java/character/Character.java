package character;

import java.util.ArrayList;


public class Character
{
    private String name;

    private Stats stats;

    private Skills skills;

    private Equipment equipment;

    public Character(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Stats getStats()
    {
        return stats;
    }

    public void setStats(Stats stats)
    {
        this.stats = stats;
    }

    public Skills getSkills()
    {
        return skills;
    }

    public void setSkills(Skills skills)
    {
        this.skills = skills;
    }

    public Equipment getEquipment()
    {
        return equipment;
    }

    public void setEquipment(Equipment equipment)
    {
        this.equipment = equipment;
    }
}
