package com.portfolio.repository;

import com.portfolio.model.RecommendedStock;
import org.springframework.data.jpa.repository.JpaRepository;

// 추천 종목을 관리하는 리포지토리
public interface RecommendRepository extends JpaRepository<RecommendedStock, Long> {
}
