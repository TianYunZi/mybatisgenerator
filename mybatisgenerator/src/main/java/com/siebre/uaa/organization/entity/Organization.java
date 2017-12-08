package com.siebre.uaa.organization.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Organization {
    private Long id;

    private Integer organizationType;

    private String organizationName;

    private String introduction;

    private String logoPath;

    private String addressLine;

    private String postCode;

    private String commissionSettlementDate;

    private Integer commissionSettlementMethod;

    private Long parentOrganization;

    private Boolean isSiebreAgent;

    private Long parentSiebreAgent;

    private Long associatedFinacialServiceOrg;

    private BigDecimal creditLimit;

    private BigDecimal margin;

    private Long bankAccountId;

    private String createUser;

    private Date createDate;

    private String updateUser;

    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(Integer organizationType) {
        this.organizationType = organizationType;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath == null ? null : logoPath.trim();
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine == null ? null : addressLine.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getCommissionSettlementDate() {
        return commissionSettlementDate;
    }

    public void setCommissionSettlementDate(String commissionSettlementDate) {
        this.commissionSettlementDate = commissionSettlementDate == null ? null : commissionSettlementDate.trim();
    }

    public Integer getCommissionSettlementMethod() {
        return commissionSettlementMethod;
    }

    public void setCommissionSettlementMethod(Integer commissionSettlementMethod) {
        this.commissionSettlementMethod = commissionSettlementMethod;
    }

    public Long getParentOrganization() {
        return parentOrganization;
    }

    public void setParentOrganization(Long parentOrganization) {
        this.parentOrganization = parentOrganization;
    }

    public Boolean getIsSiebreAgent() {
        return isSiebreAgent;
    }

    public void setIsSiebreAgent(Boolean isSiebreAgent) {
        this.isSiebreAgent = isSiebreAgent;
    }

    public Long getParentSiebreAgent() {
        return parentSiebreAgent;
    }

    public void setParentSiebreAgent(Long parentSiebreAgent) {
        this.parentSiebreAgent = parentSiebreAgent;
    }

    public Long getAssociatedFinacialServiceOrg() {
        return associatedFinacialServiceOrg;
    }

    public void setAssociatedFinacialServiceOrg(Long associatedFinacialServiceOrg) {
        this.associatedFinacialServiceOrg = associatedFinacialServiceOrg;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public BigDecimal getMargin() {
        return margin;
    }

    public void setMargin(BigDecimal margin) {
        this.margin = margin;
    }

    public Long getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(Long bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}