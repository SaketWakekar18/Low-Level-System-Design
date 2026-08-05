package models;

import java.util.Date;
import java.util.List;

public class Experience {
    private String companyName;
    private String designation;
    private String roleDescription;
    private Date startDate;
    private Date endDate;
    private List<Skill> skillsUsed;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Skill> getSkillsUsed() {
        return skillsUsed;
    }

    public void setSkillsUsed(List<Skill> skillsUsed) {
        this.skillsUsed = skillsUsed;
    }

}
