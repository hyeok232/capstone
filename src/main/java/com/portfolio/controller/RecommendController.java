package com.portfolio.controller;

import com.portfolio.model.RecommendedStock;
import com.portfolio.repository.RecommendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recommendation")
public class RecommendController {

    @Autowired
    private RecommendRepository recommendRepository;  // 추천 종목 저장소

    // 추천 종목 리스트를 조회하는 엔드포인트
    @GetMapping("/list")
    public List<RecommendedStock> getRecommendations() {
        // 데이터베이스에서 추천 종목 리스트를 반환
        return recommendRepository.findAll();
    }
}
