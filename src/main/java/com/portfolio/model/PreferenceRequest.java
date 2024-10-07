package com.portfolio.model;

public class PreferenceRequest {

    private int per;  // 사용자가 입력한 PER 순위
    private int pbr;  // 사용자가 입력한 PBR 순위
    private int roe;  // 사용자가 입력한 ROE 순위
    private int dps;  // 사용자가 입력한 DPS 순위
    private int div;  // 사용자가 입력한 DIV 순위

    // 기본 생성자
    public PreferenceRequest() {}

    // 매개변수를 통해 모든 필드를 초기화하는 생성자
    public PreferenceRequest(int per, int pbr, int roe, int dps, int div) {
        this.per = per;
        this.pbr = pbr;
        this.roe = roe;
        this.dps = dps;
        this.div = div;
    }

    // Getter 및 Setter 메서드 (각 필드 접근을 위한 메서드)
    public int getPer() {
        return per;
    }

    public void setPer(int per) {
        this.per = per;
    }

    public int getPbr() {
        return pbr;
    }

    public void setPbr(int pbr) {
        this.pbr = pbr;
    }

    public int getRoe() {
        return roe;
    }

    public void setRoe(int roe) {
        this.roe = roe;
    }

    public int getDps() {
        return dps;
    }

    public void setDps(int dps) {
        this.dps = dps;
    }

    public int getDiv() {
        return div;
    }

    public void setDiv(int div) {
        this.div = div;
    }
}
