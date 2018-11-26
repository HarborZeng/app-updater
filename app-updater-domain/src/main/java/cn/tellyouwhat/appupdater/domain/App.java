package cn.tellyouwhat.appupdater.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
public class App {
    @Id
    private Long id;

    private String appName;

    private String releaseVersion;
    private String betaVersion;
    private String alphaVersion;

    private String downloadURL;

    /**
     * 文件大小，单位字节
     */
    private Long fileSize;

    /**
     * 更新说明
     */
    private String updateNote;

    /**
     * 是否强制升级
     */
    private Boolean forceUpgradable;
}
