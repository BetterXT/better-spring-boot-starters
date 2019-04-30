package io.better.httpclient;

/**
 * @author better create in 2019-04-30 15:25
 */
public interface BHttpClientPoolBeanFactory {

    /**
     * 获取BHttpClientPool
     *
     * @param name 名字
     * @return the b http client pool
     */
    BHttpClientPool instance(String name);
}
