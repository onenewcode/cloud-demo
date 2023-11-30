package cn.onenewcode.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author 29071
 * @version 1.0
 * @data 2023/11/30 20:53
 */
@Component
@Data
@RefreshScope
@ConfigurationProperties(prefix = "pattern")
public class PatternProperties {
    private String dateformat;
}