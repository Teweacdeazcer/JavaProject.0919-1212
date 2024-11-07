package chp10.protected1;

public class Parent {
    String name;
    protected String id;

    protected void printProtected(){
        System.out.println("protected 접근 제한자는 패키지는 서로 다르지만 상관관계에 있는 부모의 멤버를 접근할 수 있다.");
    }

    void printDefault(){
        System.out.println("default 접근 제한자는 패키지가 서로 다르면 접근 불가능");
    }
}