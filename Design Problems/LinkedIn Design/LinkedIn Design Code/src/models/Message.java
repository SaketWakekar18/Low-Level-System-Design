package models;

import java.time.LocalTime;

public class Message {
    private int messageId;
    private User sender;
    private User receiver;
    private String message;
    private LocalTime sendMessageAt;

    public boolean isRead() {
        return true;
    }
}
