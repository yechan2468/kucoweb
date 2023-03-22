package kuco.accountant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

// 객원 기본 정보
@Getter
@Setter
@Entity
public class Gaekwon {
    // 객원 id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gaekwonId;

    // 휴대폰 번호 (key?)
    @Column(length = 11, nullable = false)
    private String phoneNumber;

    // 이름 (key?)
    @Column(length = 10, nullable = false)
    private String name;

    // 객원 종류 (아마/프로/지휘자)
    // string으로 저장됨
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private GaekwonType memberType;

    // 은행 계좌
    @Column(length = 40)
    private String bankAccount;
}
