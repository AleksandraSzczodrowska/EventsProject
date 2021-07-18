package com.sda.eventsproject.EventsProject.controllers;

import com.sda.eventsproject.EventsProject.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/newaccount")
    public String getAccount(Model model) {
        public String getAccount(Model model){
            model.addAttribute("account", new User());
            return "new_account_form";
        }
    }

    @PostMapping()
    public String addNewUser(User user) {
        return "redirect:/newaccount/url";
    }

    @ModelAttribute("user")
    public User getUser() {
        return new User("")
    }
}

/* to jeszcze nie jest ta część projektu
        List<Account> allAccount = accountDAO.getAllAccounts();
        model.addAttribute("allAccounts", allAccounts;
        return "accounts_list";
    }
*/


