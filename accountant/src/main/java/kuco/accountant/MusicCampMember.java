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

// 뮤직캠프 참여 인원
@Getter
@Setter
@Entity
public class MusicCampMember {
    // PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk;

    // 단원 id (FK)
    @ManyToOne
    @JoinColumn(name = "danwonId")
    private Danwon danwon;

    // 뮤직캠프 연도
    @Column(columnDefinition = "integer", nullable = false)
    private Integer participatedYear;

    // 참여 연주회 월 (MARCH/SEPTEMBER)
    // string으로 저장됨
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ParticipatedMonth participatedMonth;
}
