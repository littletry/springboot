package top.huangt.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ht
 * @date 2019/12/18 11:03
 */
@Component
public class TestJob {
    private static final Logger log = LoggerFactory.getLogger(TestJob.class);

    //上次推送的最大查询主键ID
    private static Integer lastJobMaxPushIdStatus1 = 0;
    private static final String lockLastJobTimeStatus1 = "lockLastJobTimeStatus1";
    private static int times = 0;

    /**
     * 定时任务每10秒执行一次
     */
    @Scheduled(cron = "*/10 * * * * ?")
    public void pushConFamily() {
        times++;
        log.info("TestJob.Start > " + lastJobMaxPushIdStatus1);
        List<Integer> list;
        if (lastJobMaxPushIdStatus1 == 0) {
            if (times != 1) {
                log.info("等待开始" + times);
            }
            synchronized (lockLastJobTimeStatus1) {
                if (times != 1) {
                    log.info("等待结束" + times);
                }
                list = selectAll();
                if (list.size() > 0) {
                    lastJobMaxPushIdStatus1 = list.get(0);

                    for (int i = 0; i < list.size(); i++) {
                        pushData();
                    }
                }

            }
        } else {
            list = selectAll();
            if (list.size() > 0) {
                lastJobMaxPushIdStatus1 = list.get(0);

                for (int i = 0; i < list.size(); i++) {
                    pushData();
                }
            } else {
                lastJobMaxPushIdStatus1 = 0;
            }
        }
        log.info("TestJob.End > " + lastJobMaxPushIdStatus1);
    }

    private List<Integer> selectAll() {
        System.out.println("执行查询操作");
        int size = 0;
        int maxId = 0;
        if (times == 1) {
            size = 80;
            maxId = 80;
        }
        if (times == 2) {
            size = 30;
            maxId = 90;
        }
        if (times == 3) {
            size = 15;
            maxId = 95;
        }
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(maxId);
        }
        return list;
    }

    private void pushData() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
