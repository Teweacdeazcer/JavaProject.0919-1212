package chp10.ex10_8;

public class Car {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(){
        System.out.printf("[%s]가 이동 중입니다.\n", name);
    }

    public Car(String name){
        this.name = name;
        System.out.printf("모델명: %s\n", name);
    }
}