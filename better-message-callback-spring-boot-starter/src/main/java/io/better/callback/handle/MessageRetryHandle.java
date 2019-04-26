package io.better.callback.handle;

/**
 * 消息重试的处理接口
 *
 * @param <T> the type parameter
 * @author better create in 2019-04-26 15:53
 */
public interface MessageRetryHandle<T> {

    /**
     * Retry.
     *
     * @param message the message
     */
    void retry(T message);
}
