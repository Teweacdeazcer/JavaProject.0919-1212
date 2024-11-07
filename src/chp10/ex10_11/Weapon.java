package chp10.ex10_11;

public class Weapon extends Item2 {
    String name = "기본 Weapon";
    int power;

    Weapon(){
        power = -1;
    }

    public Weapon(String name, int price, int power) {
        super(name, price);
        this.power = power;
    }

    void print(){
        System.out.printf("[%s]의 가격: %d골드, 공격력 %d \n", super.name, price, power);
    }
}
