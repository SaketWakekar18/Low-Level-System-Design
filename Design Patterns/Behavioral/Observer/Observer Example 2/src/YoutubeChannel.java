import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {

    List<IObserver> subscribers = new ArrayList<>();

    public void addSubscribers(IObserver observer){
        subscribers.add(observer);
    }

    public void uploadVideo(String title){
        System.out.println("New video: "+ title);
        for(IObserver observer: subscribers){
            observer.update(title);
        }
    }
}
