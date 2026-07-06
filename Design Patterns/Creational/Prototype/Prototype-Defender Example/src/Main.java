public class Main {
    public static void main(String[] args) {
        IDefenderPrototype prototype = new Defender90();
        IDefenderPrototype prototype1 = prototype.clone();

        System.out.println(prototype==prototype1);
    }
}