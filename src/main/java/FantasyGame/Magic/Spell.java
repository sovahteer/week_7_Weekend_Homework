package FantasyGame.Magic;

import FantasyGame.Behaviours.ISpell;
import FantasyGame.Enemies.Enemy;

public class Spell implements ISpell {
    private SpellType spell;

    public Spell(SpellType spell) {
        this.spell = spell;
    }

    public SpellType getSpell(){
        return this.spell;
    }

    public void cast(Enemy enemy){
        enemy.takeDamage(this.spell.getDamage());
    }
}
