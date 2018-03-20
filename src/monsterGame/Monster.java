package monsterGame;

public class Monster implements Properties {

    private int hp;
    private int atk;
    private String monsterName;

    public Monster(String monsterName, int hp, int atk) {
        this.hp = hp;
        this.atk = atk;
        this.monsterName = monsterName;
    }

    @Override
    public String getProperties() {
        return "Created monster of race " + getMonsterName() + ", HP = " + getHp() + ", ATK = " + getAtk();
    }

    @Override
    public String afterThatFight() {
        return monsterName + "'s attributes: HP = " + hp;
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

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public void monsterAttackThehero(Hero hero) {
        hero.setHp(hero.getHp() - atk);
    }
}
