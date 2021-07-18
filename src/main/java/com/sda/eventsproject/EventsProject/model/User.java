package com.sda.eventsproject.EventsProject.model;

import java.time.LocalDate;
import java.util.Calendar;

public class User {
    private String firstname;
    private String lastname;
    private Calendar dateofbirth;
    private String login;
    private String password;
    private String email;
    private String displayName;

    public User(String firstname, String lastname, Calendar dateofbirth, String login, String password, String email, String displayName) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
        this.login = login;
        this.password = password;
        this.email = email;
        this.displayName = displayName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Calendar getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Calendar dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
}
