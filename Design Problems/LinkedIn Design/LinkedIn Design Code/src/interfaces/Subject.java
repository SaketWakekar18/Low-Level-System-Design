package interfaces;

import models.Notification;
import models.User;

public interface Subject {
    public void addObserver(User user);
    public void removeObserver(User user);
    public void notifyObservers(Notification notification);
}
