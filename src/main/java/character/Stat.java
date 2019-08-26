package character;

public class Stat {
    private String name;

    private String description;

    private int trueLevel;

    private int effectiveLevel;

    public Stat(String name, int level) {
        this.name = name;
        this.trueLevel = level;
        this.effectiveLevel = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTrueLevel() {
        return trueLevel;
    }

    public void setTrueLevel(int trueLevel) {
        this.trueLevel = trueLevel;
    }

    public int getEffectiveLevel() {
        return effectiveLevel;
    }

    public void setEffectiveLevel(int effectiveLevel) {
        this.effectiveLevel = effectiveLevel;
    }
}
