package org.beneve.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @ClassName: AdminApplication
 * @Description: 后台管理项目启动入口
 * @author WangYiwen
 * @date 2016年7月11日 上午10:35:26
 *
 */
@SpringBootApplication
public class AdminApplication {

    /**
     *
     * @Title: main
     * @Description : TODO (这里用一句话描述这个方法的作用)
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
