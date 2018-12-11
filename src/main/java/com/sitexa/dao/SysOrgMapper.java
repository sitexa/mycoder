package com.sitexa.dao;

import com.sitexa.pojo.SysOrg;

public interface SysOrgMapper {
    int insert(SysOrg record);

    int insertSelective(SysOrg record);
}