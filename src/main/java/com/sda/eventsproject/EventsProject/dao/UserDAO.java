package com.sda.eventsproject.EventsProject.dao;

import com.sda.eventsproject.EventsProject.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getUsers();

   User getUserById(String accountId);
}
