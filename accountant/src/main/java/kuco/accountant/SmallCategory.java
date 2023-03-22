package kuco.accountant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

// 소분류
@Getter
@Setter
@Entity
public class SmallCategory {
    // 소분류 id (PK)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer smallCategoryId;

    // 내용
    @Column(length = 50, nullable = false)
    private String category;

    // 고정 카테고리 여부
    @Column(columnDefinition = "boolean default false", nullable = false)
    private Boolean isFixed;
}
