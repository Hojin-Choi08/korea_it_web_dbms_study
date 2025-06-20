package com.koreait.dbms_study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class Post { //Entity -> Mappers -> Mapper -> Repository -> Dto -> Service -> Controller
    private Integer postId;
    private String title;
    private String content;
    private Integer userId;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;
}
