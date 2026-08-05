package models;

import interfaces.Observer;
import interfaces.Person;

import java.util.Date;
import java.util.List;

public class User extends Person implements Observer {

    private String headline;
    private Date updatedDate;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public void updateProfile(Profile profile) {

    }

    public void addPost(Post post) {

    }

    public void addComment(Post post, Comment comment) {
    }

    public void requestRecommendation(User user) {

    }

    public void acceptRecommendation(User user, Recommendation recommendation) {
    }

    public void sendMessage(User receiver, Message message) {

    }

    public void followUser(User user) {

    }

    public void unfollowUser(User user) {

    }

    public void reactToPost(Post post, Reaction reaction) {

    }

    public void sendConnectionRequest(ConnectionRequest connectionRequest) {

    }

    public void acceptConnectionRequest(ConnectionRequest connectionRequest) {

    }

    public void applyForJob(Job job) {

    }

    public void addExperience(Experience experience) {

    }

    public void updateExperience(Experience experience) {

    }

    public void removeExperience(Experience experience) {

    }

    public void addEducation(Education education) {

    }

    public void updateEducation(Education education) {

    }

    public void removeEducation(Education education) {

    }

    public void addAchievements(List<Achievement> achievements) {

    }

    public void  updateAchievements(List<Achievement> achievements) {

    }

    public void removeAchievements(List<Achievement> achievements) {

    }

    public void addSkills(List<Skill> skills) {

    }

    public void updateSkills(List<Skill> skills) {

    }
    public void removeSkills(List<Skill> skills) {

    }

    @Override
    public void update(Notification notification) {
        notification.getMessage();
    }
}

