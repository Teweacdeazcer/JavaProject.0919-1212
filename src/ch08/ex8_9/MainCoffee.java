package ch08.ex8_9;

public class MainCoffee {
    public static void main(String[] args) {
        Coffee c = new Coffee("Americano",3000);
        System.out.printf("%s(%d)원 -> ", c.getName(), c.getPrice());
        c.setPrice(c.getPrice() + 500);
        System.out.printf("%s(%d)원", c.getName(), c.getPrice());
    }
}