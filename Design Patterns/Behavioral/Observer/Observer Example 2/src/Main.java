public class Main {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();

        Subscriber subscriber1 = new Subscriber("Saket");
        Subscriber subscriber2 = new Subscriber("Rahul");

        youtubeChannel.addSubscribers(subscriber1);
        youtubeChannel.addSubscribers(subscriber2);

        youtubeChannel.uploadVideo("Observer Design Pattern");
    }
}