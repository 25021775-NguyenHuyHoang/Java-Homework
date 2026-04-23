package com.banksystem;

public class BankService {
    private double Balance;

    public void withdraw(double amount) {
        if(amount>Balance) {
            return;
        }
        Balance -= amount;
    }
    public void Nap_Tien(double amount) {
        Balance += amount;
    }
}