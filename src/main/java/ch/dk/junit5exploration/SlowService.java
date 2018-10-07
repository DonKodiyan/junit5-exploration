package ch.dk.junit5exploration;

public class SlowService {
    public Integer sum(Integer a, Integer b){
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a+b;
    }
}
