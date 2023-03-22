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

// 뮤직캠프 회비
@Getter
@Setter
@Entity
public class MusicCampHoibi {
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

    // 1차 회비
    @Column(columnDefinition = "integer default 0", nullable = false)
    private Integer firstHoibi;
    
    // 2차 회비
    @Column(columnDefinition = "integer default 0")
    private Integer secondHoibi;
    
    // 3차 회비
    @Column(columnDefinition = "integer default 0")
    private Integer thirdHoibi;

    // 숙박 횟수
    @Column(columnDefinition = "integer default 0", nullable = false)
    private Integer sleepCount;

    // 점심 식사 횟수
    @Column(columnDefinition = "integer default 0", nullable = false)
    private Integer lunchCount;

    // 저녁 식사 횟수
    @Column(columnDefinition = "integer default 0", nullable = false)
    private Integer dinnerCount;
}
