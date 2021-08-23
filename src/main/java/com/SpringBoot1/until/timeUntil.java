package com.SpringBoot1.until;
import lombok.extern.slf4j.Slf4j;
import java.util.Date;

/**
 * @program:mainWorks
 * @description:关于时间的工具类
 */
@Slf4j
public class timeUntil {
    //表示第一周开始时候的时间戳
    private static final long TIME = 1614528000000l;
    private static Date date = new Date();

    /**
     * 获取当前是第几周
     * @return
     */
    public static int getWeek() {
        long time = date.getTime();
        log.info("在[{}]刻使用了getWeek方法",time);
        return (int) ((time-TIME)/604800000L)+1;
    }

    /**
     * 获取当前是周几
     * @return
     */
    public static int getDay() {
        long time = date.getTime();
        time-=TIME;
        time = time%604800000;
        int k = (int) (time/86400000);
        log.info("在[{}]刻使用了getDay方法",time);
        return k+1;
    }

}
