package com.BankSystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankService {
    private static final Logger logger = LoggerFactory.getLogger(BankService.class);
    private double balance = 1000.0; // Số dư mặc định

    public void withdraw(double amount) {
        if (amount > balance) {
            // Sử dụng mức độ ERROR cho lỗi nghiêm trọng
            logger.error("Giao dịch thất bại: Số dư không đủ. Cần rút: {}, Hiện có: {}", amount, balance);
        } else {
            balance -= amount;
            // Sử dụng mức độ INFO cho hoạt động bình thường
            logger.info("Giao dịch thành công. Số dư còn lại: {}", balance);
        }
    }
}
