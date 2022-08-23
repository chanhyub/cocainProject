package com.cocain.cocainproject.dto;

import com.cocain.cocainproject.domain.user.TbUser;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
public class UserSaveRequestDto {
    private String name;
    private String picture;

    @Builder
    public UserSaveRequestDto(String name, String picture) {
        this.name = name;
        this.picture = picture;
    }

    public TbUser toEntity() {
        return TbUser.builder()
                .name(name)
                .picture(picture)
                .build();
    }
}
