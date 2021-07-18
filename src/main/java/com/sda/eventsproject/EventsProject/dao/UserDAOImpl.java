package com.sda.eventsproject.EventsProject.dao;

import com.sda.eventsproject.EventsProject.model.User;

import java.util.List;

public class UserDAOImpl implements UserDAO {

    @Override
    public List<User> getUsers() {
        return getUsers();
    }

    @Override
    public User getUserById(String accountId) {
        return getUserById("123");
    }
}