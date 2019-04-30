package io.better.httpclient;

import lombok.Data;

/**
 * @author better create in 2019-04-30 15:30
 */
@Data
public class BHttpClientGroupProperties {

    /**
     * 组名称
     */
    private String groupName;

    /**
     * 组最大数量
     */
    private Integer maxSize;
}
