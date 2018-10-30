package com.xyj.cloud.mapper.generated;

import com.xyj.cloud.model.po.UserKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserKeyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserKey record);

    int insertSelective(UserKey record);

    UserKey selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserKey record);

    int updateByPrimaryKey(UserKey record);
}