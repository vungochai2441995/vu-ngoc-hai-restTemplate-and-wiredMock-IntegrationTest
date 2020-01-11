package com.example.demo.service.impl;

import com.example.demo.dao.LoyaltyDAO;
import com.example.demo.entity.LoyaltyEntity;
import com.example.demo.service.ILoyaltyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoyaltyService implements ILoyaltyService {

    @Autowired
    private LoyaltyDAO loyaltyDAO;

    @Override
    public Integer findLoyalpointByUserID(Long userID) {
        LoyaltyEntity loyalPoint = loyaltyDAO.findByUserID(userID);
        return loyalPoint.getLoyalPoint();
    }

    @Override
    public List<LoyaltyEntity> getAll() {
        return loyaltyDAO.findAll();
    }

    @Override
    public boolean createDB(Long userID) {
        loyaltyDAO.createUserID(userID);
        return loyaltyDAO.existsByUserID(userID);
    }
}
