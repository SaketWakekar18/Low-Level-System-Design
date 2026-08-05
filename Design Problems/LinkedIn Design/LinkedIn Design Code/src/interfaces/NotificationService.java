package interfaces;

import models.Notification;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements Subject{

    List<User> observers = new ArrayList<>();

    @Override
    public void addObserver(User user) {
        observers.add(user);
    }

    @Override
    public void removeObserver(User user) {
        observers.remove(user);
    }

    @Override
    public void notifyObservers(Notification notification) {
        for(User user: observers){
            user.update(notification);
        }
    }
}
