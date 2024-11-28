package chp12.ex12_5;

public class InterruptedException {
    public void printDelay(){
        String[] arr = {"대한민국", "스페인", "이탈리아", "캐나다", "프랑스"};
        for (int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
            try {
                Thread.sleep(1000);
            } catch (java.lang.InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}