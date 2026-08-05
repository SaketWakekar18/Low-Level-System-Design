package models;

import interfaces.SearchCatalogue;

import java.util.List;

public class Search extends SearchCatalogue {
    @Override
    public List<User> getUsers(String query) {
        return List.of();
    }

    @Override
    public List<CompanyPage> getCompany(String query) {
        return List.of();
    }

    @Override
    public List<Job> getJobs(String query) {
        return List.of();
    }

    @Override
    public List<Group> getGroups(String query) {
        return List.of();
    }
}
