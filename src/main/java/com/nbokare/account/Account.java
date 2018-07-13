package com.nbokare.account;

public class Account {
    private long accountId;

    private int userId;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account [accountId=" + accountId + ", userId=" + userId + "]";
    }
}
