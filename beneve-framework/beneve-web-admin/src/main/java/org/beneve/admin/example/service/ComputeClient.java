/**
 * @Title: ComputeClient.java
 * @Package org.beneve.admin.example.service
 * @Description: TODO(用一句话描述该文件做什么)
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
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author WangYiwen
 * @date 2016年7月18日 上午11:46:26
 *
 */
@FeignClient(value = "beneve-web-service", fallback = ComputeClientHystrix.class)
public interface ComputeClient {
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
