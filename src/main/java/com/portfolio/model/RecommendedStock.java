package com.portfolio.model;

import javax.persistence.*;

// 엔티티 클래스: 데이터베이스에 매핑되는 주식 추천 모델
@Entity
public class RecommendedStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 기본 키 자동 생성 전략
    private Long id;  // 추천 종목 ID
    private String ticker;  // 주식 티커
    private String name;  // 주식 이름
    private double recommendedPrice;  // 추천된 가격
    private double weight;  // 포트폴리오에서의 비중

    // 기본 생성자
    public RecommendedStock() {}

    // 모든 필드를 초기화하는 생성자
    public RecommendedStock(String ticker, String name, double recommendedPrice, double weight) {
        this.ticker = ticker;
        this.name = name;
        this.recommendedPrice = recommendedPrice;
        this.weight = weight;
    }

    // Getter 및 Setter 메서드 (각 필드 접근을 위한 메서드)
    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRecommendedPrice() {
        return recommendedPrice;
    }

    public void setRecommendedPrice(double recommendedPrice) {
        this.recommendedPrice = recommendedPrice;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
