package cn.tellyouwhat.appupdater.service.impl;

import cn.tellyouwhat.appupdater.domain.App;
import cn.tellyouwhat.appupdater.domain.vo.AppLatestInfoRequestVo;
import cn.tellyouwhat.appupdater.domain.vo.AppLatestInfoResponseVo;
import cn.tellyouwhat.appupdater.domain.vo.UpdateRequestVo;
import cn.tellyouwhat.appupdater.repository.UpgradeRepository;
import cn.tellyouwhat.appupdater.service.QueryUpgradeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryUpgradeServiceImpl implements QueryUpgradeService {

    final
    private UpgradeRepository repository;

    @Autowired
    public QueryUpgradeServiceImpl(UpgradeRepository repository) {
        this.repository = repository;
    }

    @Override
    public App queryUpgrade(UpdateRequestVo request) {
        return null;
    }

    @Override
    public AppLatestInfoResponseVo queryAppLatestInfo(AppLatestInfoRequestVo vo) {
        App app = repository.findByAppName(vo.getAppName()).orElse(new App());
        AppLatestInfoResponseVo appLatestInfoResponseVo = new AppLatestInfoResponseVo();
        BeanUtils.copyProperties(app, appLatestInfoResponseVo);
        return appLatestInfoResponseVo;
    }
}
