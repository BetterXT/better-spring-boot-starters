package io.better.httpclient;

import org.springframework.beans.factory.BeanFactory;

/**
 * The interface B http client bean factory.
 *
 * @author better create in 2019-04-30 15:11
 */
public interface BHttpClientBeanFactory extends BeanFactory {

    /**
     * Gets b http client.
     *
     * @return the b http client
     */
    BHttpClient instance();


}
