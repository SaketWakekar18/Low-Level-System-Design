package interfaces;

import models.CompanyPage;
import models.Group;
import models.Job;
import models.User;

import java.util.List;

public abstract class SearchCatalogue {
    public abstract List<User> getUsers(String query);

    public abstract List<CompanyPage> getCompany(String query);

    public abstract List<Job> getJobs(String query);

    public abstract List<Group> getGroups(String query);
}
