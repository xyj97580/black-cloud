package com.xyj.cloud.model;

import com.xyj.cloud.common.annotion.jsr.RangeStrConstraint;
import com.xyj.cloud.common.validator.groups.QueryGroup;
import com.xyj.cloud.common.validator.groups.QueryGroup2;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Constraint;

/**
 * Created by xyj97 on 2018/10/19.
 */

@Data
public class OperateDto {

    @NotEmpty(message = "id can not be empty")
    private String id;

//    @NotEmpty(message = "name 不能为空")
    @RangeStrConstraint(value = {"first", "second", "third"}, message = "输入name不合法", groups = {QueryGroup.class})
    private String name;

    @NotEmpty(message = "未通过", groups = {QueryGroup.class})
    private String blockNum;

}
