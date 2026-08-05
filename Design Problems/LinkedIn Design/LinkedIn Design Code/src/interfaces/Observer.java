package interfaces;

import models.Notification;

import java.util.Observable;

public interface Observer {
    public void update(Notification notification);
}
