package io.better.callback.handle;

import io.better.callback.properties.MQProperties;

import java.util.Objects;

/**
 * The type Abstract message confirm handle.
 *
 * @param <ID> the type parameter
 * @param <T>  the type parameter
 * @author better create in 2019-04-26 16:49
 */
public abstract class AbstractMessageConfirmHandle<ID, T> implements MessageConfirmHandle<ID, T> {

    private MessageCrudHandle<ID, T> messageCrudHandle;

    private MessageRetryHandle<T> messageRetryHandle;

    private MQProperties mqProperties;


    /**
     * Instantiates a new Abstract message confirm handle.
     *  @param messageCrudHandle  the message crud handle
     * @param messageRetryHandle the message retry handle
     * @param mqProperties
     */
    protected AbstractMessageConfirmHandle(MessageCrudHandle<ID, T> messageCrudHandle, MessageRetryHandle<T> messageRetryHandle, MQProperties mqProperties) {
        this.messageCrudHandle = messageCrudHandle;
        this.messageRetryHandle = messageRetryHandle;
        this.mqProperties = mqProperties;
    }

    @Override
    public void confirm(T message) {
        if (Objects.isNull(message)) {
            confirmError();
            return;
        }
        ID messageId = getMessageId(message);

        T t = messageCrudHandle.selectMessage(messageId);
        if (mqProperties.getIsOpenScheduler()) {

        }
        messageRetryHandle.retry(message);
    }


    /**
     * Gets message id.
     *
     * @param message the message
     * @return the message id
     */
    protected abstract ID getMessageId(T message);
}
