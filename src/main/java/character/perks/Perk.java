package character.perks;

import character.Character;

public abstract class Perk {
    private String name;

    private String description;

    private int level = 0;

    private Character user;

    public Perk(Character user) {
        this.user = user;
    }

    public abstract void initialize();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp(){
        this.level++;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
