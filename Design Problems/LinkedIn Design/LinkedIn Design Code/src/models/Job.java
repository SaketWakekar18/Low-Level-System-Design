package models;

import java.util.Date;

public class Job {
    private int jobId;
    private String companyName;
    private String designation;
    private double salary;
    private String Location;
    private boolean isActive;
    private Date postedAt;

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Date getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(Date postedAt) {
        this.postedAt = postedAt;
    }

    public void post() {

    }

    public void updateJob() {

    }

    public void closeJob() {

    }

    public void deleteJob() {

    }
}
