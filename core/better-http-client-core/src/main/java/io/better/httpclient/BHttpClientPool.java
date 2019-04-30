package io.better.httpclient;

import lombok.Data;

import java.util.List;

/**
 * @author better create in 2019-04-30 15:13
 */
@Data
public class BHttpClientPool {

    private List<BHttpClientGroup> bHttpClientGroups;
}
