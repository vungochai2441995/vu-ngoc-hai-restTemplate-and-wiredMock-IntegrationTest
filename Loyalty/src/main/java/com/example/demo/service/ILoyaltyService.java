package com.example.demo.service;

import com.example.demo.entity.LoyaltyEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ILoyaltyService {
    Integer findLoyalpointByUserID(Long userID);
    List<LoyaltyEntity> getAll();
    boolean createDB(Long userID);
}
