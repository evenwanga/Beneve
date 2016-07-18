/**
 * @Title: ComputeClientHystrix.java
 * @Package org.beneve.admin.example.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author WangYiwen
 * @date 2016年7月18日 下午12:06:39
 */
package org.beneve.admin.example.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: ComputeClientHystrix
 * @Description: TODO(这里用一句话描述这个类的作用)
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
