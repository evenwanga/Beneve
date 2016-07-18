/**
 * @Title: ConsumerController.java
 * @Package org.beneve.admin.example
 * @Description: TODO(用一句话描述该文件做什么)
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
 * @Description: TODO(这里用一句话描述这个类的作用)
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

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return this.computeClient.add(10, 20);
    }

    @RequestMapping("/from")
    public String from() {

        return this.from;
    }
}
