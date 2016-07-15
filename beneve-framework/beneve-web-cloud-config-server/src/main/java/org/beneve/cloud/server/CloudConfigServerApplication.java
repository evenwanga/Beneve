/**
 * @Title: CloudConfigServerApplication.java
 * @Package org.beneve.cloud.server
 * @Description: Beneve Web 子模块 - 项目配置管理服务模块
 * @author WangYiwen
 * @date 2016年7月15日 上午11:38:25
 */
package org.beneve.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: CloudConfigServerApplication
 * @Description: 项目配置管理服务模块入口
 * @author WangYiwen
 * @date 2016年7月15日 上午11:38:25
 */
@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerApplication {

    /**
     * @Title: main
     * @Description : 项目配置管理服务模块主程序
     * @param args 设定文件
     * @return void 返回类型
     *
     * @author : WangYiwen
     * @mail : 514094893@qq.com
     * @Date : 2016年7月15日
     */
    public static void main(final String[] args) {
        SpringApplication.run(CloudConfigServerApplication.class, args);
    }

}
