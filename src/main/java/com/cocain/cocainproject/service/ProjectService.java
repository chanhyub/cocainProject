package com.cocain.cocainproject.service;

import com.cocain.cocainproject.domain.project.TbProject;
import com.cocain.cocainproject.domain.project.TbProjectRepository;
import com.cocain.cocainproject.dto.ProjectRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProjectService {
    private final TbProjectRepository tbProjectRepository;

    @Transactional
    public Long save(ProjectRequestDto requestDto) {
        return tbProjectRepository.save(requestDto.toEntity()).getId();
    }

    public List<TbProject> findAll() {
        return tbProjectRepository.findAll();
    }
    public TbProject findById(Long id){
        return tbProjectRepository.findById(id).orElse(null);
    }
}
