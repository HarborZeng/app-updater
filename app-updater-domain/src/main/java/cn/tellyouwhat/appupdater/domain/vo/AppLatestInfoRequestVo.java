package cn.tellyouwhat.appupdater.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppLatestInfoRequestVo {
    @NonNull
    private String appName;
}
