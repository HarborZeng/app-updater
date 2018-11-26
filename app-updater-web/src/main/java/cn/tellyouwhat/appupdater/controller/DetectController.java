package cn.tellyouwhat.appupdater.controller;

import cn.tellyouwhat.appupdater.domain.App;
import cn.tellyouwhat.appupdater.domain.vo.UpdateRequestVo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/detect")
public class DetectController {

    @PostMapping("/{appName}")
    public App test(@PathVariable String appName, @RequestBody UpdateRequestVo updateRequest) {
        return null;
    }
}
