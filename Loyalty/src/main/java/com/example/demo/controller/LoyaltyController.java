package com.example.demo.controller;

import com.example.demo.entity.LoyaltyEntity;
import com.example.demo.service.ILoyaltyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoyaltyController {

    @Autowired
    private ILoyaltyService iLoyaltyService;

    @RequestMapping("/{id}")
    public Integer getLoyalty(@PathVariable(value = "id",required = true) Long id){
        return iLoyaltyService.findLoyalpointByUserID(id);
    };

    @GetMapping("/all")
    public List<LoyaltyEntity> getAllUser(){
        return iLoyaltyService.getAll();
    }

    @PutMapping("/create")
    public ResponseEntity<?> createDB(@RequestParam(name = "userID",required = true) Long userID){
        boolean result = iLoyaltyService.createDB(userID);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }


}
