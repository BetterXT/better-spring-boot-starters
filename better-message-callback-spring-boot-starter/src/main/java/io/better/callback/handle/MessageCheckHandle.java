package io.better.callback.handle;

/**
 * 消息检查处理接口
 *
 * @author better create in 2019-04-26 15:52
 */
public interface MessageCheckHandle {

    /**
     * Check boolean.
     *
     * @param message the message
     * @return the boolean
     */
    Boolean check(String message);
}
