public class SingletonThreadProblem {

    private static SingletonThreadProblem instance;

    private SingletonThreadProblem() {
        System.out.println("Inside Singleton Class");
    }

    public static SingletonThreadProblem getInstance() {
        if (instance == null) {
            instance = new SingletonThreadProblem();
        }
        return instance;
    }

    public static void main(String[] args) {
//        SingletonThreadProblem singletonThreadProblem1 = SingletonThreadProblem.getInstance();
//        SingletonThreadProblem singletonThreadProblem2 = SingletonThreadProblem.getInstance();

        Thread t1 = new Thread(() -> {
            SingletonThreadProblem.getInstance();
        });
        Thread t2 = new Thread(() -> {
            SingletonThreadProblem.getInstance();
        });

        t1.start();
        t2.start();

    }

}
