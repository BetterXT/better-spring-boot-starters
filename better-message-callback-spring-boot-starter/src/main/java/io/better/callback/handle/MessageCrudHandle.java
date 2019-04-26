package io.better.callback.handle;

/**
 * message query 处理接口
 *
 * @param <ID> the type parameter
 * @param <T>  the type parameter
 * @author better create in 2019-04-26 16:43
 */
public interface MessageCrudHandle<ID, T> {

    /**
     * Insert message t.
     *
     * @param message the message
     * @return the t
     */
    T insertMessage(T message);

    /**
     * Select message t.
     *
     * @param messageId the message id
     * @return the t
     */
    T selectMessage(ID messageId);

    /**
     * Update message t.
     *
     * @param messageId the message id
     * @param message   the message
     * @return the t
     */
    T updateMessage(ID messageId, T message);

    /**
     * Delete message t.
     *
     * @param messageId the message id
     * @return the t
     */
    T deleteMessage(ID messageId);
}
