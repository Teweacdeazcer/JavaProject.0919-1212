package chp12.ex12_4;

public class MainNullPointer {
    public static void main(String[] args) {
    NullPointerExceptionTest nullTest = new NullPointerExceptionTest();

    nullTest.addName("홍길동");
    nullTest.addName("오현민");
    nullTest.printAllNames();
    }
}