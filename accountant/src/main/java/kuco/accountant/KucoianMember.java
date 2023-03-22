package kuco.accountant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class KucoianMember {
    // PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk;

    // 참여 단원 id (FK)
    @ManyToOne
    @JoinColumn(name = "danwonId")
    private Danwon danwon;

    // 쿠코인의 밤 연도
    @Column(columnDefinition = "integer", nullable = false)
    private Integer participatedYear;
}
