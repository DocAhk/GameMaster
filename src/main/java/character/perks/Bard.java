package character.perks;

import character.Character;

import java.util.ArrayList;
import java.util.List;

public class Bard extends Perk {
    private static final String name = "Bard";

    private static final String description = "A spell-caster that relies on their charm and musical talents.";

    private static final int max_level = 5;

    private static List<String> levelDescriptions = new ArrayList<>();


    private int level = 0;


    public Bard(Character user) {
        super(user);
        levelDescriptions.add("Level 1 description");
        levelDescriptions.add("Level 2 description");
        levelDescriptions.add("Level 3 description");
        levelDescriptions.add("Level 4 description");
        levelDescriptions.add("Level 5 description");
    }

    public String getLevelDescription(int level) {
        try {
            return levelDescriptions.get(level - 1);
        }
        catch(Exception e) {
            System.out.println("Invalid Level");
        }
        return "";
    }

    public String getNextLevelDescription() {
        return levelDescriptions.get(level);
    }

    public void initialize() {

    }
}
