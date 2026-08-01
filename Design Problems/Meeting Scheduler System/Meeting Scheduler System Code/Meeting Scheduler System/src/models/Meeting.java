package models;

import constants.InviteStatus;

import java.util.List;
import java.util.Map;

public class Meeting {
    private long meetingId;
    private String title;
    private String description;
    private MeetingRoom meetingRoom;
    private Interval interval;
    private List<User> attendees;
    private User sender;
    private Map<User, InviteStatus>  inviteStatus;

    public long getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(long meetingId) {
        this.meetingId = meetingId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }

    public void setMeetingRoom(MeetingRoom meetingRoom) {
        this.meetingRoom = meetingRoom;
    }

    public Interval getInterval() {
        return interval;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }

    public List<User> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<User> attendees) {
        this.attendees = attendees;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Map<User, InviteStatus> getInviteStatus() {
        return inviteStatus;
    }

    public void setInviteStatus(Map<User, InviteStatus> inviteStatus) {
        this.inviteStatus = inviteStatus;
    }

    public void addAttendeeToMeeting(List<User> user) {

    }

    private void removeAttendeeFromMeeting(List<User> user) {
    }

}
