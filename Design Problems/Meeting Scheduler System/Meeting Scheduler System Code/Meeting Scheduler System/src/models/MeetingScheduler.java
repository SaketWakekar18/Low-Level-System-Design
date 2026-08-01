package models;

import java.util.List;

public class MeetingScheduler {
    private static final MeetingScheduler meetingSchedulerInstance = null;
    private List<MeetingRoom> meetingRooms;

    private MeetingScheduler() {

    }
    
    private static class SingletonHolder {
        private static final MeetingScheduler INSTANCE = new MeetingScheduler();
    }

    public static MeetingScheduler getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public List<MeetingRoom> getAvailableMeetingRooms() {
        return meetingRooms;
    }

    public void setAvailableMeetingRooms(List<MeetingRoom> meetingRooms) {
        this.meetingRooms = meetingRooms;
    }

    public void scheduleMeeting(Meeting meeting) {

    }

    public void cancelMeeting(Meeting meeting) {

    }

    public MeetingRoom bookMeetingRoom(MeetingRoom meetingRoom, int capacity, Interval interval) {
        return null;
    }

    public MeetingRoom cancelMeetingRoom(MeetingRoom meetingRoom, Interval interval) {
        return null;
    }

}
