package com.sda.eventsproject.EventsProject.controllers;

import com.sda.eventsproject.EventsProject.dao.UserDAO;
import com.sda.eventsproject.EventsProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserDAO userDAO;

    @Autowired
    public UserController(UserDAO userService) {
        this.userDAO = userService;
    }


    @GetMapping("/newuser") // url jaki w przedlagarce ma byc
    public String getAccount(Model model) {
        model.addAttribute("account", new User());
        return "new_account_form"; //dane polaczone pliku html
    }

    @PostMapping("/user/registration")
    public String addNewUser(@Valid @ModelAttribute User user, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "new_account_form";
        }
        return "redirect:/user/newaccount";
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