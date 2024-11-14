package chp11.ex11_01;

public class S24 implements Phone, Alram, Message{
    public void sendAirdrop(String content) {
        System.out.println("에어드롭으로 "+ content + "를(을) 보낸다");
    }

    @Override
    public void playMusic(String musicTitle) {
        System.out.println(musicTitle + "음악을 재생한다.");
    }

    @Override
    public void beep() {
        System.out.println("삐빅삐빅 소리가 발생한다.");
    }

    @Override
    public void sendMessage(String content) {
        System.out.println(content + " 메시지를 전송한다.");
    }

    @Override
    public void receiveMessage(String content) {
        System.out.println(content + " 메시지를 받는다.");
    }

    @Override
    public void callPhone(String phoneNum) {
        System.out.println(phoneNum + "로 전화를 건다.");
    }

    @Override
    public void receivePhone(String phoneNum) {
        System.out.println(phoneNum + "로 전화를 받는다.");
    }

}
