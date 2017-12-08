package com.siebre.uaa.commissionSettingsEntry.mapper;

import com.siebre.uaa.commissionSettingsEntry.entity.CommissionSettingsEntry;

public interface CommissionSettingsEntryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommissionSettingsEntry record);

    int insertSelective(CommissionSettingsEntry record);

    CommissionSettingsEntry selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommissionSettingsEntry record);

    int updateByPrimaryKey(CommissionSettingsEntry record);
}