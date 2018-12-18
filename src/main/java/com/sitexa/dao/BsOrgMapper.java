package com.sitexa.dao;

import com.sitexa.entity.BsOrg;

public interface BsOrgMapper {
    int deleteByPrimaryKey(String orgId);

    int insert(BsOrg record);

    int insertSelective(BsOrg record);

    BsOrg selectByPrimaryKey(String orgId);

    int updateByPrimaryKeySelective(BsOrg record);

    int updateByPrimaryKey(BsOrg record);
}