package com.tom.ssm.entity;

import org.springframework.stereotype.Component;

/**
 * ClassName: AccountEntity
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/11 16:30
 */
@Component
public class AccountEntity {
    private Integer accountId;
    private Integer userId;
    private Double accountBalance;
    private Integer accountState;

    public AccountEntity() {
    }

    public AccountEntity(Integer accountId, Integer userId, Double accountBalance, Integer accountState) {
        this.accountId = accountId;
        this.userId = userId;
        this.accountBalance = accountBalance;
        this.accountState = accountState;
    }

    @Override
    public String toString() {
        return "AccountEntity{" +
                "accountId=" + accountId +
                ", userId=" + userId +
                ", accountBalance=" + accountBalance +
                ", accountState=" + accountState +
                '}';
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Integer getAccountState() {
        return accountState;
    }

    public void setAccountState(Integer accountState) {
        this.accountState = accountState;
    }
}
