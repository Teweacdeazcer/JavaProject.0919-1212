package chp10.ex10_9;

public class MainAnimal {
    public static void main(String[] args) {
        // 추상클래스는 new 연산자로 객체 생성이 불가능함
        // Animal animal = new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.setName("말티즈");
        dog.eat("사료");
        dog.cry("멍멍");
        dog.sleep(5);
        dog.wag();
        System.out.println();

        cat.setName("페르시안");
        cat.cry("야옹");
        cat.eat("생선");
        cat.grooming();
        cat.sleep(6);

        // 업캐스팅을 하면 오버라이딩 한 것만 사용 가능.
        // Animal animal = new Dog();
        // animal.wag();는 사용 불가.
    }
}

