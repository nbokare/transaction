package com.nbokare.transaction;

public class Transaction {
    private long id;

    private long sourceAccountId;

    private long destinationAccountId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSourceAccountId() {
        return sourceAccountId;
    }

    public void setSourceAccountId(long sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    public long getDestinationAccountId() {
        return destinationAccountId;
    }

    public void setDestinationAccountId(long destinationAccountId) {
        this.destinationAccountId = destinationAccountId;
    }

    @Override
    public String toString() {
        return "Transaction [id=" + id + ", sourceAccountId=" + sourceAccountId + ", destinationAccountId="
                + destinationAccountId + "]";
    }
}
