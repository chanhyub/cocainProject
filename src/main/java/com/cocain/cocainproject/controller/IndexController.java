package com.cocain.cocainproject.controller;

import com.cocain.cocainproject.config.auth.dto.SessionUser;
import com.cocain.cocainproject.dto.UserSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final HttpSession httpSession;
    @GetMapping("/")
    public String index(Model model) {
        SessionUser user = (SessionUser) httpSession.getAttribute("user"); // (1)

        if(user != null) {
            // (2)
            model.addAttribute("userInfo", user);
        }
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/createProject")
    public String createProject(Model model){
        SessionUser user = (SessionUser) httpSession.getAttribute("user"); // (1)

        if(user != null) {
            // (2)
            model.addAttribute("userInfo", user);
        }
        return "createProject";
    }
}
