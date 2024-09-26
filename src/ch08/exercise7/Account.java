package ch08.exercise7;

public class Account {
    private int balance;
    private String AccNumber;

    public Account(String accNumber, int balance) {
        AccNumber = accNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getAccNumber() {
        return AccNumber;
    }
    public void setAccNumber(String accNumber) {
        AccNumber = accNumber;
    }

    public boolean transfer(Account acc, int amount) {
        if (balance >= amount) {
            balance -= amount;
            acc.balance += amount;
            System.out.printf("B계좌에 %d원 송금 완료.\n", amount);
            return true;
        } else {
            System.out.println("잔액이 부족하여 더 이상 송금할 수 없습니다.");
            return false;
        }
    }

    public String toStr() {
        return "Account {AccNum: " + AccNumber +
                ", balance:" + balance + "}" + "\n";
    }
}