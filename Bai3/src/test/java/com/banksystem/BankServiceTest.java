package com.banksystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankServiceTest {
    @Test
    void testWithdrawSuccess() {
        BankService bank = new BankService();
        // Kiểm tra xem rút 500 có bị lỗi không (giả sử số dư ban đầu 1000)
        assertDoesNotThrow(() -> bank.withdraw(500));
    }
    @Test
    void testFilePath() {
        // Cố tình dùng dấu gạch chéo ngược kiểu Windows
        String path = "C:\\data\\temp.txt";
        assertTrue(path.contains("\\"));
    }
}