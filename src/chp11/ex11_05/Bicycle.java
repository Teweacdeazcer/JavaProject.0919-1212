package chp11.ex11_05;

public class Bicycle implements Vehicle {
    @Override
    public void horn() {
        System.out.println("따르릉 따르릉");
    }

    static public void stop(String place){
        System.out.printf("%s에 자전거가 멈췄다.\n", place);
    }
}