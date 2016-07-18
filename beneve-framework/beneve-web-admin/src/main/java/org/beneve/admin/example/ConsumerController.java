/**
 * @Title: ConsumerController.java
 * @Package org.beneve.admin.example
 * @Description: 测试 RestController 方法
 * @author WangYiwen
 * @date 2016年7月18日 上午11:32:18
 */
package org.beneve.admin.example;

import org.beneve.admin.example.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConsumerController
 * @Description: 测试 RestController 方法
 * @author WangYiwen
 * @date 2016年7月18日 上午11:32:18
 *
 */
@RefreshScope
@RestController
public class ConsumerController {
    @Autowired
    ComputeClient computeClient;

    @Value("${from}")
    private String from;

    /**
     *
     * @Title: add
     * @Description : 调用 service 服务器方法 （Web Service 服务器 Feign 方法测试）
     * @return 设定文件
     * @return Integer 返回类型
     *
     * @author : WangYiwen
     * @mail : 514094893@qq.com
     * @Date : 2016年7月18日
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return this.computeClient.add(10, 20);
    }

    /**
     *
     * @Title: from
     * @Description : 测试统一配置文件参数获取方法
     * @return 设定文件
     * @return String 返回类型
     *
     * @author : WangYiwen
     * @mail : 514094893@qq.com
     * @Date : 2016年7月18日
     */
    @RequestMapping("/from")
    public String from() {

        return this.from;
    }
}
