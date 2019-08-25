package character;

public class Skill extends Stat {

    private String effectiveStat;

    public Skill(String name, int stat, String effectiveStat) {
        super(name, stat);
        this.effectiveStat = effectiveStat;
    }

    public String getEffectiveStat() {
        return effectiveStat;
    }

    public void setEffectiveStat(String effectiveStat) {
        this.effectiveStat = effectiveStat;
    }
}
