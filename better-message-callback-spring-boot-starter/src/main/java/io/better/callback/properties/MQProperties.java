package io.better.callback.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author better create in 2019-04-26 16:39
 */
@Component
@ConfigurationProperties(prefix = "message.callback")
@Data
public class MQProperties {

    /**
     * mq类型，有active，rocket，kafka，rabbit四种类型
     */
    private String mqType = "rabbit";

    /**
     * 确认队列
     */
    private String confirmQueue;

    /**
     * 检查队列
     */
    private String checkQueue;

    /**
     * 是否开启定时
     */
    private Boolean isOpenScheduler = false;

    private Integer retryTimes = 3;
}
