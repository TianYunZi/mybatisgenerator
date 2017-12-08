package com.siebre.uaa.commissionSettings.mapper;

import com.siebre.uaa.commissionSettings.entity.CommissionSettings;

public interface CommissionSettingsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommissionSettings record);

    int insertSelective(CommissionSettings record);

    CommissionSettings selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommissionSettings record);

    int updateByPrimaryKey(CommissionSettings record);
}