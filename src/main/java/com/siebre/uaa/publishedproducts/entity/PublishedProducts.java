package com.siebre.uaa.publishedproducts.entity;

import java.util.Date;

public class PublishedProducts {
    private Long id;

    private Long productid;

    private Long organizationid;

    private Date startdate;

    private Date enddate;

    private Long commissionsettingsid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public Long getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(Long organizationid) {
        this.organizationid = organizationid;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Long getCommissionsettingsid() {
        return commissionsettingsid;
    }

    public void setCommissionsettingsid(Long commissionsettingsid) {
        this.commissionsettingsid = commissionsettingsid;
    }
}