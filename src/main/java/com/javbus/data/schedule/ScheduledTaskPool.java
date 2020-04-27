package com.javbus.data.schedule;

import com.javbus.data.base.actress.ActressService;
import com.javbus.data.base.movie.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/21 22:26
 * @Description: 定时任务
 */
@Component
@Slf4j
public class ScheduledTaskPool {

    @Autowired
    private MovieService movieService;

    @Autowired
    private ActressService actressService;


    // initialDelay ：fixedRate() 或fixedDelay()第一次执行前延迟的毫秒数
    //第一次延迟5秒执行，之后按照fixedRate的规则每6000秒执行一次
    @Scheduled(initialDelay = 5000, fixedRate = 6000000)
    @Async
    public void paymentServiceTask() {
        long count;
        count = actressService.oldDataToNew();
        log.info(String.valueOf(count));
//        movieService.oldDataToNew();
    }
}
