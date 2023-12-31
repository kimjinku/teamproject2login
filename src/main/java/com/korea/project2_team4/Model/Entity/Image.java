package com.korea.project2_team4.Model.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName; //파일 원본명
    private String filePath; //파일 저장 경로

    @ManyToOne
    private Post postImages;

    @OneToOne
    private Profile profileImage;

    @OneToOne
    private Pet petImage;

}
