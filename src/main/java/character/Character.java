package character;

import character.perk.Perk;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Character {
    private String firstName;

    private String lastName;

    private int level;

    private String bio;

    private String portrait;

    private List<Stat> stats;

    private List<Skill> skills;

    private List<Perk> perks;

    private List<Ability> abilities;

    public Character() {
        this.firstName = "";
        this.level = 0;
        this.stats = new ArrayList<>();
        this.skills = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    public Stat getStat(String name) {
        for(Stat s: stats) {
            if(s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
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

    public void addAbility(Ability a) {
        abilities.add(a);
    }
}
