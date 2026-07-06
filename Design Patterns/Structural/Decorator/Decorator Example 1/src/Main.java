public class Main {
    public static void main(String[] args) {
        ICar car = new Scorpio();
        BulletProofScorpio scorpio = new BulletProofScorpio(car);
        System.out.println("Weight of Scorpio: "+car.getWeight()+ " kg");
        System.out.println("Weight of bullet proof Scorpio: "+scorpio.getWeight()+ " kg");
    }
}