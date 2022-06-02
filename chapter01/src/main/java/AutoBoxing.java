import java.util.List;

public class AutoBoxing {
    public static void main(String[] args) {
        //一切都是对象

      /*  Integer a=100;

        Integer b=100;

        Integer c=129;
        Integer d=129;

        System.out.println(a==b);
        System.out.println(c==d);*/

        Integer a = Integer.valueOf(100);
        Integer b = Integer.valueOf(100);
        Integer c = Integer.valueOf(129);
        Integer d = Integer.valueOf(129);
        System.out.println((a == b));
        System.out.println((c == d));
    }
}
