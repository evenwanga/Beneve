/**
 * @Title: ComputeController.java
 * @Package org.beneve.admin.example
 * @Description: TODO(用一句话描述该文件做什么)
 * @author WangYiwen
 * @date 2016年7月18日 上午10:53:18
 */
package org.beneve.admin.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ComputeController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author WangYiwen
 * @date 2016年7月18日 上午10:53:18
 *
 */
@RestController
public class ComputeController {

    /**
     * 日志模板
     */
    private static Logger logger = LoggerFactory.getLogger(ComputeController.class);

    @Autowired
    private DiscoveryClient client;

    @SuppressWarnings("static-access")
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam final Integer a, @RequestParam final Integer b) {
        final ServiceInstance instance = this.client.getLocalServiceInstance();
        final Integer r = a + b;
        this.logger.info("/add, host:" + instance.getHost() + ", service_id:"
                + instance.getServiceId() + ", result:" + r);
        return r;
    }

}
