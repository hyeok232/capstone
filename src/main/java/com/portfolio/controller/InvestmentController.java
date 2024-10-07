package com.portfolio.controller;

import com.portfolio.model.InvestmentRequest;
import com.portfolio.model.RecommendedStock;
import com.portfolio.repository.RecommendRepository;
import com.portfolio.service.AnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/investment")
public class InvestmentController {

    @Autowired
    private AnalysisService analysisService;  // 분석팀 API 호출 서비스

    @Autowired
    private RecommendRepository recommendRepository;  // 추천 종목 저장소

    // 투자 정보를 받아서 추천 종목을 분석받고 저장하는 엔드포인트
    @PostMapping("/setup")
    public ResponseEntity<String> setupInvestment(@RequestBody InvestmentRequest request) {
        int numberOfCompanies = request.getNumberOfCompanies();  // 사용자가 입력한 기업 수
        double investmentAmount = request.getInvestmentAmount();  // 사용자가 입력한 투자 금액

        // 분석팀에서 추천 종목 데이터를 받아옴
        List<RecommendedStock> recommendations = analysisService.getRecommendations(numberOfCompanies, investmentAmount);

        // 추천 종목 데이터를 데이터베이스에 저장
        recommendRepository.saveAll(recommendations);

        return ResponseEntity.ok("투자 설정이 완료되었습니다.");
    }
}

