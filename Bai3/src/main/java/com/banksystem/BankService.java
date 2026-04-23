package com.banksystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankService {
    private static final Logger logger = LoggerFactory.LoggerFactory.getLogger(BankService.class);

    // Loi 1: Ten bien co dau gach duoi va viet hoa (Sai quy tac Java)
    private double balance_Tai_Khoan = 1000.0;

    public void withdraw(double amount) {
        // Loi 2: Thieu khoang trang sau 'if' va quanh dau '>'
        if(amount>balance_Tai_Khoan) {
            logger.error("Giao dich that bai: So du khong du.");
        } else {
            balance_Tai_Khoan -= amount;
            logger.info("Giao dich thanh cong.");
        }
    }

    // Loi 3: Ten phuong thuc co dau gach duoi
    public double get_Balance() {
        return balance_Tai_Khoan;
    }
}