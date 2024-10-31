package chp10.ex10_8;

public class Truck extends Car{
    private double payload;

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    public Truck(String name, double payload) {
        super(name); // 부모가 가지고 있는 생성자는 반드시 호출한다.
        this.payload = payload;
        System.out.printf("적재량: %.1f 톤\n", payload);
    }

    public void load(){
        System.out.printf("[%s]가 물건을 적재합니다. (최대 %.1f톤)\n", getName(), payload);
    }
}