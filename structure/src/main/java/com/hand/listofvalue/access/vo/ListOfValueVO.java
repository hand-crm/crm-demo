package com.hand.listofvalue.access.vo;

import java.util.Date;

public class ListOfValueVO {
    private String code;//值列表编码
    private Date created;//创建日期
    private String createdBy;//创建人
    private Date updated;//更新日期
    private String updatedBy;//更新人
    private String type;//类型
    private String language;//语言
    private String value;//显示值
    private String name;//独立语言代码
    private String parentListCode;//父值列表编码
    private Integer level;//层级
    private String activeFlag;//生效标识
    private String description;//描述

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentListCode() {
        return parentListCode;
    }

    public void setParentListCode(String parentListCode) {
        this.parentListCode = parentListCode;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(String activeFlag) {
        this.activeFlag = activeFlag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ListOfValueVO{" +
                "code='" + code + '\'' +
                ", created=" + created +
                ", createdBy='" + createdBy + '\'' +
                ", updated=" + updated +
                ", updatedBy='" + updatedBy + '\'' +
                ", type='" + type + '\'' +
                ", language='" + language + '\'' +
                ", value='" + value + '\'' +
                ", name='" + name + '\'' +
                ", parentListCode='" + parentListCode + '\'' +
                ", level=" + level +
                ", activeFlag='" + activeFlag + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
