package cn.tellyouwhat.appupdater.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

@Data
@NoArgsConstructor
public class UpdateRequestVo {
    @NonNull
    private String appVersion;
    private String OSType;
    private String OSVersion;
    /**
     * 手机生产厂商
     */
    private String manufacturer;
}
