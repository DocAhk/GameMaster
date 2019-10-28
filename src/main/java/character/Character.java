package character;

import character.perks.Perk;

import java.util.List;
import java.util.ArrayList;

public class Character {
    private String name;

    private int level;

    private String bio;

    private String portrait;

    private List<Stat> stats;

    private List<Skill> skills;

    private List<Perk> perks;

    private List<Ability> abilities;

    public Character() {
        this.name = "";
        this.level = 0;
        this.stats = new ArrayList<>();
        this.skills = new ArrayList<>();
    }

    public Character(String name) {
        this.name = name;
        this.level = 0;
        this.stats = new ArrayList<>();
        this.skills = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public List<Stat> getStats() {
        return stats;
    }

    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Stat getStat(String name) {
        for(Stat s: stats) {
            if(s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public Skill getSkill(String name) {
        for (Skill s : skills) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public List<Perk> getPerks() {
        return perks;
    }

    public void setPerks(List<Perk> perks) {
        this.perks = perks;
    }

    public Perk getPerks(String name) {
        for(Perk perk: perks) {
            if(perk.getName().equals(name)) {
                return perk;
            }
        }
        return null;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }
}
