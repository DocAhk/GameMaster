package character.perk;

import character.Ability;
import character.Character;

import java.util.List;

public abstract class ClassPerk extends Perk {

    protected static List<Ability> abilities;

    private static final int MAX_LEVEL = 5;

    protected ClassPerk(Character user) {
        super(user, MAX_LEVEL);
    }

    @Override
    public void levelUp() {
        super.levelUp();
        user.addAbility(abilities.get(level - 1));
    }
}
