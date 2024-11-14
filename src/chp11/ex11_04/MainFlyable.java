package chp11.ex11_04;

import java.util.ArrayList;

public class MainFlyable {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Helicopter hc = new Helicopter();
        Rocket rc = new Rocket();
        // 배열의 각 객체의 참조값을 저장
        Flyable[] flyables = {bird, hc, rc};

        for (Flyable flyable : flyables) {
            flyable.fly();
        }
        // ArrayList를 이용한 방법
        System.out.println("*********************************************");
        ArrayList<Flyable> flyableList = new ArrayList<Flyable>();
        flyableList.add(rc);
        flyableList.add(hc);
        flyableList.add(bird);
        for (Flyable flyable : flyableList) {
            flyable.fly();
        }
    }
}