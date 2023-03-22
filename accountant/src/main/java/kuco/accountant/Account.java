package kuco.accountant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

// 장부
@Getter
@Setter
@Entity
public class Account {
    // PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk;

    // 예산 집행 연도 (연주회 기준)
    @Column(columnDefinition = "integer", nullable = false)
    private Integer participatedYear;

    // 예산 집행 월 (JANUARY~DECEMBER)
    // string으로 저장됨
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ParticipatedMonth participatedMonth;

    // 대분류
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private BigCategory bigCategory;

    // 중분류
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MiddleCategory middleCategory;

    // 소분류
    @ManyToOne
    @JoinColumn(name = "smallCategoryId")
    private SmallCategory smallCategory;

    // 예상 지출
    // >0 : 수입
    // <0 : 지출
    @Column(columnDefinition = "integer default 0", nullable = false)
    private Integer expectedAmount;

    // 실현된 지출
    @Column(columnDefinition = "integer default 0", nullable = false)
    private Integer spentAmount;
}
