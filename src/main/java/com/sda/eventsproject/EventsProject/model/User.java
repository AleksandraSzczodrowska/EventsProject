package com.sda.eventsproject.EventsProject.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Calendar;

public class User {
    public User() {
    }
    @NotNull
    private String id;
    @NotNull
    private String firstname;
    @NotNull
    private String lastname;
    private Calendar dateofbirth;
    @Size(min=2, max=15)
    private String login;
    @NotNull
    private String password;
    @Email
    private String email;
    @NotBlank
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
