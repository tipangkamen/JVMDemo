import java.util.concurrent.TimeUnit;

public class ExceptionTest {
    public static void main(String[] args) throws Exception {
        new Thread(()->{
            try {
                System.out.println("错误");
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        },"t1").start();
        while (true){
            System.out.println("1");
            TimeUnit.SECONDS.sleep(1);
        }

    }
}
