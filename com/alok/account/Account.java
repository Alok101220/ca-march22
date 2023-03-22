package com.alok.account;
public class Account {
    private int id;
   private long accNumber;
   private CustomerInfo customerInfo;
   private String accType;
   private long accBalance;
   private boolean status;

    public Account() {
    }

    public Account(int id,long accNumber, CustomerInfo customerInfo, String accType, long accBalance, boolean status) {
        this.id=id;
        this.accNumber = accNumber;
        this.customerInfo = customerInfo;
        this.accType = accType;
        this.accBalance = accBalance;
        this.status = status;
    }

    public long getAccNumber() {
        return this.accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    public String getAccType() {
        return this.accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public long getAccBalance() {
        return this.accBalance;
    }

    public void setAccBalance(long accBalance) {
        this.accBalance = accBalance;
    }

    public boolean isStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Account accNumber(long accNumber) {
        setAccNumber(accNumber);
        return this;
    }

    public Account customerInfo(CustomerInfo customerInfo) {
        setCustomerInfo(customerInfo);
        return this;
    }

    public Account accType(String accType) {
        setAccType(accType);
        return this;
    }

    public Account accBalance(long accBalance) {
        setAccBalance(accBalance);
        return this;
    }

    public Account status(boolean status) {
        setStatus(status);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " accNumber='" + getAccNumber() + "'" +
            ", customerInfo='" + getCustomerInfo() + "'" +
            ", accType='" + getAccType() + "'" +
            ", accBalance='" + getAccBalance() + "'" +
            ", status='" + isStatus() + "'" +
            "}";
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
}
