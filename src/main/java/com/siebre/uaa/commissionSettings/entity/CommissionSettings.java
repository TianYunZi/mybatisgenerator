package com.siebre.uaa.commissionSettings.entity;

public class CommissionSettings {
    private Long id;

    private Short single;

    private String resttermsdescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getSingle() {
        return single;
    }

    public void setSingle(Short single) {
        this.single = single;
    }

    public String getResttermsdescription() {
        return resttermsdescription;
    }

    public void setResttermsdescription(String resttermsdescription) {
        this.resttermsdescription = resttermsdescription == null ? null : resttermsdescription.trim();
    }
}