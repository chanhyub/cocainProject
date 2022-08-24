package com.cocain.cocainproject.dto;

import com.cocain.cocainproject.domain.project.TbProject;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class ProjectRequestDto {
    private String process;
    private String membernum;
    private String techlist;
    private String startingdate;
    private String duration;
    private String messenger;
    private String address;
    private String projecttitle;
    private String projectinner;

    @Builder
    public ProjectRequestDto(String process, String membernum, String techlist, String startingdate, String duration, String messenger, String address, String projecttitle, String projectinner){
        this.process = process;
        this.membernum = membernum;
        this.techlist = techlist;
        this.startingdate = startingdate;
        this.duration = duration;
        this.messenger = messenger;
        this.address = address;
        this.projecttitle = projecttitle;
        this.projectinner = projectinner;
    }

    public TbProject toEntity(){
        return TbProject.builder()
                .process(process)
                .membernum(membernum)
                .techlist(techlist)
                .startingdate(startingdate)
                .duration(duration)
                .messenger(messenger)
                .address(address)
                .projecttitle(projecttitle)
                .projectinner(projectinner)
                .build();
    }
}
