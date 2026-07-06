public class SingletonThreadLazyLoadingSolution {

    private static SingletonThreadLazyLoadingSolution instance;

    private SingletonThreadLazyLoadingSolution() {
        System.out.println("Performing Lazy Loading");
    }

    public static class Solution {
        public static final SingletonThreadLazyLoadingSolution INSTANCE = new SingletonThreadLazyLoadingSolution();
    }

    private static SingletonThreadLazyLoadingSolution getInstance() {
        return Solution.INSTANCE;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            SingletonThreadLazyLoadingSolution.getInstance();
        });
        Thread t2 = new Thread(() -> {
            SingletonThreadLazyLoadingSolution.getInstance();
        });

        t1.start();
        t2.start();
    }
}
