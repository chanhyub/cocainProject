package com.cocain.cocainproject.controller;

import com.cocain.cocainproject.dto.ProjectRequestDto;
import com.cocain.cocainproject.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RequiredArgsConstructor
@RestController
public class ProjectController {
    private final ProjectService projectService;

    @PostMapping("/api/v1/saveproject")
    public RedirectView save(ProjectRequestDto requestDto){
        projectService.save(requestDto);
        return new RedirectView("/");
    }

}
