package com.cn.tianxia.admin.model.txdata;

public class ProxyFeeConfig {
    private Integer id;

    private Float managerFee;

    private Float paymentFee;

    private Integer paymentLimit;

    private Float withdrawFee;

    private Integer withdrawLimit;

    private Integer cid;

    private Integer userFsApportioned;

    private Integer userZsApportioned;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getManagerFee() {
        return managerFee;
    }

    public void setManagerFee(Float managerFee) {
        this.managerFee = managerFee;
    }

    public Float getPaymentFee() {
        return paymentFee;
    }

    public void setPaymentFee(Float paymentFee) {
        this.paymentFee = paymentFee;
    }

    public Integer getPaymentLimit() {
        return paymentLimit;
    }

    public void setPaymentLimit(Integer paymentLimit) {
        this.paymentLimit = paymentLimit;
    }

    public Float getWithdrawFee() {
        return withdrawFee;
    }

    public void setWithdrawFee(Float withdrawFee) {
        this.withdrawFee = withdrawFee;
    }

    public Integer getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Integer withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUserFsApportioned() {
        return userFsApportioned;
    }

    public void setUserFsApportioned(Integer userFsApportioned) {
        this.userFsApportioned = userFsApportioned;
    }

    public Integer getUserZsApportioned() {
        return userZsApportioned;
    }

    public void setUserZsApportioned(Integer userZsApportioned) {
        this.userZsApportioned = userZsApportioned;
    }
}