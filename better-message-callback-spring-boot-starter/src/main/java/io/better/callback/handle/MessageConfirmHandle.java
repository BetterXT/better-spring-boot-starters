package io.better.callback.handle;

/**
 * 消息确认处理接口
 *
 * @param <T> the type parameter
 * @author better create in 2019-04-26 15:53
 */
public interface MessageConfirmHandle<ID, T> {

    /**
     * Confirm.
     *
     * @param message the message
     */
    void confirm(T message);

    void confirmError();

    void messageExists();
}
