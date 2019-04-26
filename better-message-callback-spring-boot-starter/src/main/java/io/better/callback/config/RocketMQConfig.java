package io.better.callback.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

/**
 * RocketMQ 相关配置
 *
 * @author better create in 2019-04-26 16:33
 */
@ConditionalOnProperty(prefix = "message.callback.mq_type", havingValue = "rocket")
public class RocketMQConfig {
}
