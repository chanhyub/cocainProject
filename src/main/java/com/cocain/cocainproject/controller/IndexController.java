package com.cocain.cocainproject.controller;

import com.cocain.cocainproject.config.auth.dto.SessionUser;
import com.cocain.cocainproject.domain.project.TbProject;
import com.cocain.cocainproject.dto.UserSaveRequestDto;
import com.cocain.cocainproject.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final HttpSession httpSession;
    private final ProjectService projectService;
    @GetMapping("/")
    public String index(Model model, Model model_2) {
        SessionUser user = (SessionUser) httpSession.getAttribute("user");

        List<TbProject> plist = projectService.findAll();

        if(user != null) {

            model.addAttribute("userInfo", user);
        }
        model_2.addAttribute("plist", plist);
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
        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        if(user != null) {

            model.addAttribute("userInfo", user);
        }
        return "createProject";
    }
    @GetMapping("/projectDetail/{id}")
    public String projectDetail(Model model,Model model_2 ,@PathVariable("id") Long id) {
        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        TbProject tbProject = projectService.findById(id);

        if(user != null) {

            model.addAttribute("userInfo", user);
        }
        model_2.addAttribute("project", tbProject);
        return "projectDetail";
    }

}
