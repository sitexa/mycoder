package com.sitexa.pojo;

import java.util.Date;

public class SysOrg {
    private String oid;

    private String oname;

    private String pid;

    private Integer olevel;

    private String otype;

    private String oaddr;

    private String ocode;

    private String onature;

    private String onaturename;

    private Integer status;

    private Date created;

    private Date updated;

    public SysOrg(String oid, String oname, String pid, Integer olevel, String otype, String oaddr, String ocode, String onature, String onaturename, Integer status, Date created, Date updated) {
        this.oid = oid;
        this.oname = oname;
        this.pid = pid;
        this.olevel = olevel;
        this.otype = otype;
        this.oaddr = oaddr;
        this.ocode = ocode;
        this.onature = onature;
        this.onaturename = onaturename;
        this.status = status;
        this.created = created;
        this.updated = updated;
    }

    public SysOrg() {
        super();
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Integer getOlevel() {
        return olevel;
    }

    public void setOlevel(Integer olevel) {
        this.olevel = olevel;
    }

    public String getOtype() {
        return otype;
    }

    public void setOtype(String otype) {
        this.otype = otype == null ? null : otype.trim();
    }

    public String getOaddr() {
        return oaddr;
    }

    public void setOaddr(String oaddr) {
        this.oaddr = oaddr == null ? null : oaddr.trim();
    }

    public String getOcode() {
        return ocode;
    }

    public void setOcode(String ocode) {
        this.ocode = ocode == null ? null : ocode.trim();
    }

    public String getOnature() {
        return onature;
    }

    public void setOnature(String onature) {
        this.onature = onature == null ? null : onature.trim();
    }

    public String getOnaturename() {
        return onaturename;
    }

    public void setOnaturename(String onaturename) {
        this.onaturename = onaturename == null ? null : onaturename.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}