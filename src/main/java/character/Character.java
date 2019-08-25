package character;

import java.util.ArrayList;

public class Character {
    private String name;

    private String bio;

    private String portrait;

    private ArrayList<Stat> stats;

    private ArrayList<Skill> skills;

    public Character() {
        name = "";
    }

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public ArrayList<Stat> getStats() {
        return stats;
    }

    public void setStats(ArrayList<Stat> stats) {
        this.stats = stats;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
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
}
