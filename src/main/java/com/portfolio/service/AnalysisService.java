package com.portfolio.service;

import com.portfolio.model.PreferenceRequest;
import com.portfolio.model.RecommendedStock;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class AnalysisService {

    // 분석팀 API에 성향 데이터를 보내 분석 요청
    public String analyzePreferences(PreferenceRequest preferences) {
        String apiUrl = "http://your-team-analysis-api/preferences/analyze";  // 분석팀 API URL

        RestTemplate restTemplate = new RestTemplate();

        // POST 요청을 보내서 분석 결과를 반환받음
        String result = restTemplate.postForObject(apiUrl, preferences, String.class);

        return result;
    }

    // 추천 종목 데이터를 분석팀 API로부터 받아옴
    public List<RecommendedStock> getRecommendations(int numberOfCompanies, double investmentAmount) {
        String apiUrl = "http://your-team-analysis-api/recommendations";  // 분석팀 API URL

        RestTemplate restTemplate = new RestTemplate();

        // GET 요청을 통해 추천 종목 리스트를 반환받음
        List<RecommendedStock> recommendations = restTemplate.getForObject(apiUrl, List.class);

        return recommendations;
    }
}
