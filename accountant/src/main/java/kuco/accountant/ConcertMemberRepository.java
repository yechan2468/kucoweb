package kuco.accountant;

import org.springframework.data.jpa.repository.JpaRepository;

// PK가 없다?
public interface ConcertMemberRepository extends JpaRepository<ConcertMember, Integer>{
    
}
