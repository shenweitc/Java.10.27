package Runtime_27;

public class Demo01 {
    public static void main(String[] args) {
        //获取Runtime对象
        //Runtime r=Runtime.getRuntime();
        //获取CPU线程数
        System.out.println(Runtime.getRuntime().availableProcessors());
        //总内存大小
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024+"MB");
        //已经获取总内存大小
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024+"MB");
        //剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024+"MB");
    }
}
