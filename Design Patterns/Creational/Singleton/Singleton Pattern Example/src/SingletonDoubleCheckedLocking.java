public class SingletonDoubleCheckedLocking {
    private static volatile SingletonDoubleCheckedLocking instance;

    private SingletonDoubleCheckedLocking(){
        System.out.println("Inside Singleton Double Checked Locking");
    }

    public static SingletonDoubleCheckedLocking getInstance(){
        if(instance==null){
            synchronized (SingletonDoubleCheckedLocking.class){
                if(instance==null){
                    instance=new SingletonDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{SingletonDoubleCheckedLocking.getInstance();});
        Thread t2 = new Thread(()->{SingletonDoubleCheckedLocking.getInstance();});

        t1.start();
        t2.start();
    }
}
