package top.flobby.util;


import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class DateUtilTest {

    @Test
    void formatDateTime() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(DateUtil.formatDateTime(now));
    }
}