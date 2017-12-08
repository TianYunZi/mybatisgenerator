package com.siebre.uaa.commissionSettingsEntry.entity;

public class CommissionSettingsEntry {
    private Long id;

    private String paymentperiod;

    private Short rate;

    private Long commissionsettingsid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentperiod() {
        return paymentperiod;
    }

    public void setPaymentperiod(String paymentperiod) {
        this.paymentperiod = paymentperiod == null ? null : paymentperiod.trim();
    }

    public Short getRate() {
        return rate;
    }

    public void setRate(Short rate) {
        this.rate = rate;
    }

    public Long getCommissionsettingsid() {
        return commissionsettingsid;
    }

    public void setCommissionsettingsid(Long commissionsettingsid) {
        this.commissionsettingsid = commissionsettingsid;
    }
}