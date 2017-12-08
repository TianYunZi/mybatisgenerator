package com.siebre.uaa.publishedproducts.mapper;

import com.siebre.uaa.publishedproducts.entity.PublishedProducts;

public interface PublishedProductsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PublishedProducts record);

    int insertSelective(PublishedProducts record);

    PublishedProducts selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PublishedProducts record);

    int updateByPrimaryKey(PublishedProducts record);
}