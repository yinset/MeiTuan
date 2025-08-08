package fun.roehui.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "aliyun.alioss")
@Data
public class AliOssProperties {

//    @ConfigurationProperties(prefix = "aliyun.oss"):
//
//    表示该类用于读取配置文件中以aliyun.oss为前缀的属性
//    例如，aliyun.oss.endpoint、aliyun.oss.accessKeyId等

    private String endpoint;    // 阿里云OSS访问端点

    private String accessKeyId;    // 阿里云账号AccessKey ID

    private String accessKeySecret;  // 阿里云账号AccessKey Secret

    private String bucketName;     // OSS存储空间名称

}