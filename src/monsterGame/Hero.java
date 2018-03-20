package monsterGame;

public class Hero implements Properties {
    private String heroName;
    private int hp;
    private int atk;
    private int exp;

    public Hero(String heroName, int hp, int atk, int exp) {
        this.heroName = heroName;
        this.hp = hp;
        this.atk = atk;
        this.exp = exp;
    }

    public void fightWhenMonterNotUsingMagic(Monster monster) {
        if (atk > monster.getAtk()) {
            exp = exp + 10;
            monster.setHp(monster.getHp() - atk);
        } else {
            hp = hp - monster.getAtk();
        }
    }

    public void fightWhenTheMontersUsingMagic(Monster monster) {
        if (atk > monster.getAtk()) {
            exp = exp + 10;
            monster.setHp(monster.getHp() - (atk / 2));
        } else {
            hp = hp - monster.getAtk();
        }
    }


    @Override
    public String getProperties() {
        return "Created hero " + getHeroName() + ". HP = " + getHp() + ", ATK = " + getAtk() + ", EXP = " + getExp();
    }

    @Override
    public String afterThatFight() {
        return heroName + "'s attributes: HP = " + hp + " XP = " + exp;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}