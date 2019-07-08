package character;


public class Character
{
    private String name;

    private StatSet statSet;

    private SkillSet skillSet;

    private Equipment equipment;

    private String Bio;

    public Character()
    {

    }

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

    public StatSet getStatSet()
    {
        return statSet;
    }

    public void setStatSet(StatSet statSet)
    {
        this.statSet = statSet;
    }

    public SkillSet getSkillSet()
    {
        return skillSet;
    }

    public void setSkillSet(SkillSet skillSet)
    {
        this.skillSet = skillSet;
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
