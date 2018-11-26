package cn.tellyouwhat.appupdater.controller;

import cn.tellyouwhat.appupdater.domain.vo.AppLatestInfoRequestVo;
import cn.tellyouwhat.appupdater.domain.vo.AppLatestInfoResponseVo;
import cn.tellyouwhat.appupdater.service.QueryUpgradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("info")
public class AppInfoController {

    private final QueryUpgradeService queryUpgradeService;

    @Autowired
    public AppInfoController(QueryUpgradeService queryUpgradeService) {
        this.queryUpgradeService = queryUpgradeService;
    }

    @GetMapping("{appName}")
    public AppLatestInfoResponseVo getAppLatestInfo(@PathVariable String appName) {
        return queryUpgradeService.queryAppLatestInfo(new AppLatestInfoRequestVo(appName));
    }
}
