package chp11.ex11_05;

public interface Vehicle {
    void horn();
    default void move(String from, String to) {
        System.out.printf("%s에서 %s까지 이동합니다.\n", from, to);
    }

    // 인터페이스의 정의된 static 메소드는 오버라이딩을 할 수 없다.
    static public void stop(String place){
        System.out.println(place + "에 멈춰섰다.");
    }
}
