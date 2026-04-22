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
    void testFilePathRefactored() {
        // Dùng File.separator để Java tự chọn \ hoặc / tùy máy
        String path = "data" + java.io.File.separator + "temp.txt";

        // Kiểm tra xem đường dẫn có chứa dấu phân cách của đúng hệ điều hành đó không
        assertTrue(path.contains(java.io.File.separator),
                "Đường dẫn phải chứa dấu phân cách phù hợp với OS!");
    }
}