package com.portfolio.controller;

import com.portfolio.model.PreferenceRequest;
import com.portfolio.service.AnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/preferences")
public class PreferenceController {

    @Autowired
    private AnalysisService analysisService;  // 분석팀 API 호출 서비스

    // 투자 성향 데이터를 받아서 분석을 요청하는 엔드포인트
    @PostMapping("/analyze")
    public ResponseEntity<String> analyzePreferences(@RequestBody PreferenceRequest preferences) {
        // 성향 데이터를 분석팀에 전달하여 결과를 받아옴
        String result = analysisService.analyzePreferences(preferences);

        // 분석 결과를 반환
        return ResponseEntity.ok(result);
    }
}
