package models;

import java.util.Date;
import java.util.List;

public class Achievement {
    private String title;
    private String description;
    private Date creationDate;
    private List<Skill> skillsUsed;

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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<Skill> getSkillsUsed() {
        return skillsUsed;
    }

    public void setSkillsUsed(List<Skill> skillsUsed) {
        this.skillsUsed = skillsUsed;
    }
}
