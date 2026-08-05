package models;

import constants.Visibility;

import java.util.Date;
import java.util.List;

public class Post {
    private int postId;
    private String content;
    private List<Comment> comments;
    private List<Reaction> reactions;
    private Date createdAt;
    private String hashtags;
    private List<User> taggedUsers;
    private Visibility visibility;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Reaction> getReactions() {
        return reactions;
    }

    public void setReactions(List<Reaction> reactions) {
        this.reactions = reactions;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getHashtags() {
        return hashtags;
    }

    public void setHashtags(String hashtags) {
        this.hashtags = hashtags;
    }

    public List<User> getTaggedUsers() {
        return taggedUsers;
    }

    public void setTaggedUsers(List<User> taggedUsers) {
        this.taggedUsers = taggedUsers;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

}
