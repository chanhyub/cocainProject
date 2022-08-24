package com.cocain.cocainproject.domain.project;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
@Entity
public class TbProject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String process;

    @Column(length = 50, nullable = false)
    private String membernum;

    @Column(length = 500, nullable = false)
    private String techlist;

    @Column(nullable = false)
    private String startingdate;

    @Column(length = 50, nullable = false)
    private String duration;

    @Column(length = 50, nullable = false)
    private String messenger;

    @Column(length = 500, nullable = false)
    private String address;

    @Column(length = 800, nullable = false)
    private String projecttitle;

    @Column(length = 800, nullable = false)
    private String projectinner;

    @Builder
    public TbProject (String process, String membernum, String techlist, String startingdate, String duration, String messenger, String address, String projecttitle, String projectinner){
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
}
