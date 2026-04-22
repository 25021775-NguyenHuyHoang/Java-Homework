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
        // Cách 1: Kiểm tra xem hệ điều hành có đang dùng dấu gạch chéo ngược làm mặc định không
        // Trên Windows, File.separator là \
        // Trên Linux/Mac, File.separator là /
        assertEquals("\\", java.io.File.separator, "Lỗi: Hệ điều hành này không dùng dấu gạch chéo ngược!");
    }
}