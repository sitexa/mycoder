package com.sitexa.entity;

import java.util.Date;

public class BsOrg {
    private String orgId;

    private String parentId;

    private String parentIds;

    private String parentName;

    private String shortName;

    private String orgName;

    private Short orgLevel;

    private String orgType;

    private String orgAddr;

    private Date startDate;

    private Date endDate;

    private String status;

    private Date createDate;

    private Date lastUpdate;

    private String updator;

    private Short orderby;

    private String remark;

    private Short isleaf;

    private String createUser;

    private String sourorgId;

    private String orgCode;

    private String orgNature;

    private String orgNatureName;

    private String isSyn;

    public BsOrg(String orgId, String parentId, String parentIds, String parentName, String shortName, String orgName, Short orgLevel, String orgType, String orgAddr, Date startDate, Date endDate, String status, Date createDate, Date lastUpdate, String updator, Short orderby, String remark, Short isleaf, String createUser, String sourorgId, String orgCode, String orgNature, String orgNatureName, String isSyn) {
        this.orgId = orgId;
        this.parentId = parentId;
        this.parentIds = parentIds;
        this.parentName = parentName;
        this.shortName = shortName;
        this.orgName = orgName;
        this.orgLevel = orgLevel;
        this.orgType = orgType;
        this.orgAddr = orgAddr;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.updator = updator;
        this.orderby = orderby;
        this.remark = remark;
        this.isleaf = isleaf;
        this.createUser = createUser;
        this.sourorgId = sourorgId;
        this.orgCode = orgCode;
        this.orgNature = orgNature;
        this.orgNatureName = orgNatureName;
        this.isSyn = isSyn;
    }

    public BsOrg() {
        super();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds == null ? null : parentIds.trim();
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName == null ? null : parentName.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Short getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(Short orgLevel) {
        this.orgLevel = orgLevel;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType == null ? null : orgType.trim();
    }

    public String getOrgAddr() {
        return orgAddr;
    }

    public void setOrgAddr(String orgAddr) {
        this.orgAddr = orgAddr == null ? null : orgAddr.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    public Short getOrderby() {
        return orderby;
    }

    public void setOrderby(Short orderby) {
        this.orderby = orderby;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getIsleaf() {
        return isleaf;
    }

    public void setIsleaf(Short isleaf) {
        this.isleaf = isleaf;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getSourorgId() {
        return sourorgId;
    }

    public void setSourorgId(String sourorgId) {
        this.sourorgId = sourorgId == null ? null : sourorgId.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getOrgNature() {
        return orgNature;
    }

    public void setOrgNature(String orgNature) {
        this.orgNature = orgNature == null ? null : orgNature.trim();
    }

    public String getOrgNatureName() {
        return orgNatureName;
    }

    public void setOrgNatureName(String orgNatureName) {
        this.orgNatureName = orgNatureName == null ? null : orgNatureName.trim();
    }

    public String getIsSyn() {
        return isSyn;
    }

    public void setIsSyn(String isSyn) {
        this.isSyn = isSyn == null ? null : isSyn.trim();
    }
}