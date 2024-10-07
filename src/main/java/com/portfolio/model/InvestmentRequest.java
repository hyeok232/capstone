package com.portfolio.model;

public class InvestmentRequest {

    private int numberOfCompanies;  // 사용자가 입력한 기업 수
    private double investmentAmount;  // 사용자가 입력한 투자 금액

    // 기본 생성자 (기본 값을 가진 객체 생성을 위한 빈 생성자)
    public InvestmentRequest() {}

    // 모든 필드를 초기화하는 생성자
    public InvestmentRequest(int numberOfCompanies, double investmentAmount) {
        this.numberOfCompanies = numberOfCompanies;
        this.investmentAmount = investmentAmount;
    }

    // Getter 및 Setter 메서드
    public int getNumberOfCompanies() {
        return numberOfCompanies;
    }

    public void setNumberOfCompanies(int numberOfCompanies) {
        this.numberOfCompanies = numberOfCompanies;
    }

    public double getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(double investmentAmount) {
        this.investmentAmount = investmentAmount;
    }
}

