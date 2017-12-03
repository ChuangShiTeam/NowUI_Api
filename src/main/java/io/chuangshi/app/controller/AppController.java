package io.chuangshi.app.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;

import io.chuangshi.app.entity.App;
import io.chuangshi.app.service.AppService;
import io.chuangshi.common.result.ResultBean;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author marcus
 * @since 2017-11-26
 */
@RestController
@RequestMapping("/app")
public class AppController {
    
    @Autowired
    private AppService appService;
    
    @GetMapping("/page/list")
    public Object pageList(@RequestBody JSONObject jsonObject) {
        Integer pageIndex = jsonObject.getInteger("page_index");
        Integer pageSize = jsonObject.getInteger("page_size");
        
        Page<App> page = appService.selectPage(new Page<App>(pageIndex, pageSize));
        
        Map<String, Object> result = new HashMap<>();
        result.put("total", page.getTotal());
        result.put("list", page.getRecords());
        return new ResultBean<>(result);
    }
    
    @GetMapping("/save")
    public Object save(@RequestBody JSONObject jsonObject) {
        App app = jsonObject.toJavaObject(App.class);
        boolean success = appService.insert(app);
        return new ResultBean<>(success);
    }
    
    @GetMapping("/update")
    public Object update(@RequestBody JSONObject jsonObject) {
        App app = jsonObject.toJavaObject(App.class);
        boolean success = appService.updateById(app);
        return new ResultBean<>(success);
    }
    
    @GetMapping("/delete")
    public Object delete(@RequestBody JSONObject jsonObject) {
        String appId = jsonObject.getString(App.APP_ID);
        boolean success = appService.deleteById(appId);
        return new ResultBean<>(success);
    }

}
