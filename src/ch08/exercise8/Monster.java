package ch08.exercise8;

public class Monster {
    private String name;
    private int hp;
    private int maxHp;

    public Monster(String name) {
        this.name = name;
        this.maxHp = 30;
        this.hp = maxHp;
    }

    public void attack(Monster enemy) {
        enemy.hp -= 10;
        System.out.printf("[%s]의 공격 -> %s의 체력: %d/%d\n", name, enemy.name, enemy.hp, enemy.maxHp);
    }

    public static void battle(Monster a, Monster b) {
        while (a.hp > 0 && b.hp > 0) {
            Monster attacker = (Math.random() < 0.5) ? a : b;
            Monster defender = (attacker == a) ? b : a;
            attacker.attack(defender);
            if (defender.hp <= 0) {
                break;
            }
            defender.attack(attacker);
            if (attacker.hp <= 0) {
                break;
            }
        }
    }
}
