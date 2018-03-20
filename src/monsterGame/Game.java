package monsterGame;

public class Game {
    public static void main(String[] args)
    {
        Hero hos = new Hero("Chuck",100,10,0);
        Monster szornyEgy = new Monster("Rock skin cyclops",30,8);
        Monster szornyKetto = new Monster("Fire Wizard",50,6);

        System.out.println(hos.getProperties());
        System.out.println(szornyEgy.getProperties());
        System.out.println(szornyKetto.getProperties());
        System.out.println(hos.getHeroName() + " attacks " + szornyEgy.getMonsterName());
        hos.fightWhenMonterNotUsingMagic(szornyEgy);
        System.out.println(hos.afterThatFight());
        System.out.println(szornyEgy.afterThatFight());
        System.out.println(szornyEgy.getMonsterName() + " starts using magic");
        System.out.println(hos.getHeroName() + " attacks " + szornyEgy.getMonsterName());
        hos.fightWhenTheMontersUsingMagic(szornyEgy);
        System.out.println(hos.afterThatFight());
        System.out.println(szornyEgy.afterThatFight());
        System.out.println(szornyKetto.getMonsterName() + " attacks "+hos.getHeroName());
        szornyKetto.monsterAttackThehero(hos);
        System.out.println(szornyKetto.afterThatFight());
        System.out.println(hos.afterThatFight());
        System.out.println(hos.getHeroName() + " attacks " + szornyKetto.getMonsterName());
        hos.fightWhenMonterNotUsingMagic(szornyKetto);
        System.out.println(hos.afterThatFight());
        System.out.println(szornyKetto.afterThatFight());;

    }
}
