package com.example.demo.dao;

import com.example.demo.entity.LoyaltyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface LoyaltyDAO extends JpaRepository<LoyaltyEntity, Long> {
    LoyaltyEntity findByUserID(Long userID);
    boolean existsByUserID(Long userID);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO loyalty(loyal_point,userid) values(10,?)",nativeQuery = true)
    void createUserID(Long userid);

}
