package character.perk;

import character.Character;

import java.util.List;

public abstract class Perk {
    protected String name;

    protected String description;

    protected static int maxLevel;

    protected int level;

    protected Character user;

    protected static List<String> levelDescriptions;

    protected Perk(Character user, int maxLevel) {
        this.user = user;
        this.maxLevel = maxLevel;
        level = 0;
        levelUp();
    }

    protected void levelUp() {
        if(level < maxLevel) {
            level++;
        } else {
            System.out.println("Already at max level");
        }
    }

    public String getLevelDescription(int level) {
        try {
            return levelDescriptions.get(level - 1);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("Invalid Level");
        }
        return "";
    }

    public String getNextLevelDescription()
    {   if(level < levelDescriptions.size()) {
            return levelDescriptions.get(level);
        } else {
            System.out.println(user.getFirstName() + " is already at max level for " + name);
            return "";
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
