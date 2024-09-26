package ch08.exercise7;

public class mainAccount {
    public static void main(String[] args) {
        Account a = new Account("123-45",10000);
        Account b = new Account("567-89",10000);
        System.out.print(a.toStr());
        System.out.print(b.toStr());
        while (a.transfer(b,3000)){
            ;
        }
        System.out.print(a.toStr());
        System.out.print(b.toStr());
    }
}