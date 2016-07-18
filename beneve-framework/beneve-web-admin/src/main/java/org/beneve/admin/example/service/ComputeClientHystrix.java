/**
 * @Title: ComputeClientHystrix.java
 * @Package org.beneve.admin.example.service
 * @Description: 测试 Feign 自带断路器功能组件
 * @author WangYiwen
 * @date 2016年7月18日 下午12:06:39
 */
package org.beneve.admin.example.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: ComputeClientHystrix
 * @Description: 断路器触发后执行该方法
 * @author WangYiwen
 * @date 2016年7月18日 下午12:06:39
 *
 */
@Component
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public Integer add(@RequestParam(value = "a") final Integer a,
            @RequestParam(value = "b") final Integer b) {
        return -9999;
    }

}
