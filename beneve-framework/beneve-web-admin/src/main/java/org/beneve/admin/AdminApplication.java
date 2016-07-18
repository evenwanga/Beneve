package org.beneve.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 *
 * @ClassName: AdminApplication
 * @Description: 项目后台管理子模块启动入口
 * @author WangYiwen
 * @date 2016年7月11日 上午10:35:26
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AdminApplication {

    /**
     *
     * @Title: main
     * @Description : 项目启动入口
     * @param args 设定文件
     * @return void 返回类型
     *
     * @author : WangYiwen
     * @mail : 514094893@qq.com
     * @Date : 2016年7月11日
     *
     */
    public static void main(final String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
