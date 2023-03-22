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

// 객원 페이
@Getter
@Setter
@Entity
public class ConcertGaekwonPayment {
    // PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk;

    // 객원 id (FK)
    @ManyToOne
    @JoinColumn(name = "gaekwonid")
    private Gaekwon gaekwon;

    // 객원 종류 (아마/프로/지휘자)
    // string으로 저장됨
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private GaekwonType memberType;
    
    // 참여 연주회 연도
    @Column(columnDefinition = "integer", nullable = false)
    private Integer participatedYear;

    // 참여 연주회 월 (MARCH/SEPTEMBER)
    // string으로 저장됨
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ParticipatedMonth participatedMonth;

    // 페이 액수
    @Column (columnDefinition = "integer default 0", nullable = false)
    private Integer pay;
}
