/**
 * @Title: ComputeClient.java
 * @Package org.beneve.admin.example.service
 * @Description: 测试 Spring cloud 的 Web Service 组件 Feign
 * @author WangYiwen
 * @date 2016年7月18日 上午11:46:26
 */
package org.beneve.admin.example.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: ComputeClient
 * @Description: 调用 Web Service 服务 （ beneve-web-service ）方法，测试断路器是否正常
 * @author WangYiwen
 * @date 2016年7月18日 上午11:46:26
 *
 */
@FeignClient(value = "beneve-web-service", fallback = ComputeClientHystrix.class)
public interface ComputeClient {
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
