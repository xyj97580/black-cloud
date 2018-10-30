package com.xyj.cloud.model.po;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName="myBuilder1")
public class UserKey {
    private Long id;

    private String name;

    private String type;

    private String owner;

    private String encryptKey;

    private Date updateTime;
}