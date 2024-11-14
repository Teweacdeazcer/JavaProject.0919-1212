package chp11.ex11_01;

public interface Phone {
    // 인터페이스에는 상수, 추상메소드, default 메소드 등을 사용할 수 있습니다.
    // 상수는 final, static 생략
    static final String PRODUCT_NAME = "Apple";
    public abstract void callPhone(String phoneNum);
    // 추상메소드는 public abstract를 생략가능
    void receivePhone(String phoneNum);
}
