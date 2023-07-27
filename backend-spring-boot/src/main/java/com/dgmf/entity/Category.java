package com.dgmf.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "tbl_category")
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "category_name")
    @NotBlank
    private String categoryName;
    @Column(name = "category_description")
    @NotBlank
    private String categoryDescription;
    @Column(name = "image_url")
    @NotBlank
    private String imageUrl;
}
