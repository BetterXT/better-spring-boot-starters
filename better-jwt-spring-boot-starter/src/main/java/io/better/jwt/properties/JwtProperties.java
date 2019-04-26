package io.better.jwt.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author better create in 2019-04-26 15:25
 */
@Component
@ConfigurationProperties(prefix = "better.jwt.props")
public class JwtProperties {
}
