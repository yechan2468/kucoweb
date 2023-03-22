package kuco.accountant;

import org.springframework.data.jpa.repository.JpaRepository;

// PK가 없음
public interface ConcertDanwonHoibiRepository extends JpaRepository<ConcertDanwonHoibi, Integer> {
    
}
