package cn.tellyouwhat.appupdater.service;

import cn.tellyouwhat.appupdater.domain.App;
import cn.tellyouwhat.appupdater.domain.vo.AppLatestInfoRequestVo;
import cn.tellyouwhat.appupdater.domain.vo.AppLatestInfoResponseVo;
import cn.tellyouwhat.appupdater.domain.vo.UpdateRequestVo;

public interface QueryUpgradeService {

    App queryUpgrade(UpdateRequestVo request);

    AppLatestInfoResponseVo queryAppLatestInfo(AppLatestInfoRequestVo vo);
}
