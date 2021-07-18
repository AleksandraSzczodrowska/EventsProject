package com.sda.eventsproject.EventsProject.controllers;

import com.sda.eventsproject.EventsProject.dao.UserDAO;
import com.sda.eventsproject.EventsProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserDAO userDAO;

    @Autowired
    public UserController(UserDAO userService) {
        this.userDAO = userService;
    }


    @GetMapping("/newaccount")
    public String getAccount(Model model) {
        model.addAttribute("account", new User());
        return "new_account_form";
    }

    @PostMapping()
    public String addNewUser(User user) {
        return "redirect:/newaccount/url";
    }

    @ModelAttribute("user")
    public User getUser() {
        return new User();
    }

    @GetMapping("users/list")
    public String getAllUsers(Model model) {
        List<User> allUsers = userDAO.getUsers();
        model.addAttribute("allUsers", allUsers);
        return "users_list";
    }
}