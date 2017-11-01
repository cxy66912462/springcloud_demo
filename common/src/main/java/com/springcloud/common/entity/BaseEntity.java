package com.springcloud.common.entity;

public class BaseEntity {

    private Integer status;

    private String createTime;

    private Integer createBy;

    private String changeTime;

    private Integer changeBy;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public String getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(String changeTime) {
        this.changeTime = changeTime;
    }

    public Integer getChangeBy() {
        return changeBy;
    }

    public void setChangeBy(Integer changeBy) {
        this.changeBy = changeBy;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "status=" + status +
                ", createTime='" + createTime + '\'' +
                ", createBy=" + createBy +
                ", changeTime='" + changeTime + '\'' +
                ", changeBy=" + changeBy +
                '}';
    }
}
