package com.banksystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankService {
    private static final Logger logger = LoggerFactory.getLogger(BankService.class);
    private double balance_Tai_Khoan = 1000.0;
    public void withdraw(double amount) {
        if (amount > balance_Tai_Khoan) {
            logger.error("Giao dịch thất bại: Số dư không đủ. Cần rút: {}, Hiện có: {}", amount, balance_Tai_Khoan);
        } else {
            balance_Tai_Khoan -= amount;
            logger.info("Giao dịch thành công. Số dư còn lại: {}", balance_Tai_Khoan);
        }
    }
}
