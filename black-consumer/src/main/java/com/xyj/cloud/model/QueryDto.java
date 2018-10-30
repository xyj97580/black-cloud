package com.xyj.cloud.model;

import com.xyj.cloud.common.annotion.jsr.RangeStrConstraint;
import com.xyj.cloud.common.validator.groups.QueryGroup;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by xyj97 on 2018/10/22.
 */

@Data
public class QueryDto {

    @NotEmpty(message = "id can not be empty")
    private String id;

    @NotEmpty(message = "name 不能为空")
//    @RangeStrConstraint(value = {"first", "second", "third"}, message = "输入name不合法")
    private String name;

    @NotEmpty(message = "此分组需要验证，未通过")
    private String blockNum;
}
