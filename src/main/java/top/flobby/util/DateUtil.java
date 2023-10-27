package top.flobby.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author : Flobby
 * @program : github-action-demo
 * @description :
 * @create : 2023-10-27 08:27
 **/

public class DateUtil {
    public static String formatDateTime(LocalDateTime localDateTime) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dtf.format(localDateTime);
    }
}
