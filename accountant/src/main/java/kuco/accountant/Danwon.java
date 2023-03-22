package kuco.accountant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

// 단원 기본 정보
@Getter
@Setter
@Entity
public class Danwon {
    // 단원 id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer danwonId;

    // 단원 이름
    @Column(length = 10, nullable = false)
    private String name;

    // 학번
    @Column(length = 10)
    private String studentId;

    // 휴대폰 번호
    @Column(length = 11, nullable = false)
    private String phoneNumber;

    // 연주회 참여 횟수
    @Column(columnDefinition = "integer default 0", nullable = false)
    private Integer concertParticipationCount;

    // 졸업 여부
    @Column(columnDefinition = "boolean default false", nullable = false)
    private Boolean graduated;
}
