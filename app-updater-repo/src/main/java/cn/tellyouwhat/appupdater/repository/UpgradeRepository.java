package cn.tellyouwhat.appupdater.repository;

import cn.tellyouwhat.appupdater.domain.App;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UpgradeRepository extends MongoRepository<App, Long> {

    Optional<App> findByAppName(String appName);
}
