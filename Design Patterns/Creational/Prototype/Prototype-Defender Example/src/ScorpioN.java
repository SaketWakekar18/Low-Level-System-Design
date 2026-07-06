public class ScorpioN implements Cloneable{
    private String color;
    private String model;

    public ScorpioN(String color, String model){
        this.color=color;
        this.model=model;
    }

    public ScorpioN clone(){
        try {
            return (ScorpioN) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void display(){
        System.out.println("Color: "+color + "Model: "+ model);
    }

    public static void main(String[] args) {
        ScorpioN car1 = new ScorpioN("Black","N");
        ScorpioN car2 = car1.clone();

        car1.display();
        car2.display();

        System.out.println(car1==car2);
    }
}
