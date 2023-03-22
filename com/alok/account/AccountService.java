package com.alok.account;

import java.util.Hashtable;

public interface AccountService {
    public void createAccount(Hashtable<Integer, Account> map);
    public void removeAccount(Hashtable<Integer, Account> map);
    public void printDetails(Hashtable<Integer, Account> map);
    public void updateAccountDetails(Hashtable<Integer,Account> map,int id); 
}
