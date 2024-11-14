package chp11.ex11_01;

public class MainPhone {
    public static void main(String[] args) {
        Phone p = new IPhone();
        p.callPhone("010-3333-7777");
        p.receivePhone("02-1111-5555");
        System.out.println("제조사명: "+ Phone.PRODUCT_NAME);

        IPhone iphone = new IPhone();
        iphone.callPhone("02-3333-7777");
        iphone.beep();
        iphone.playMusic("APT.");
        iphone.sendAirdrop("사진");
        iphone.sendMessage("오늘 수능 대박나라~");
    }
}
