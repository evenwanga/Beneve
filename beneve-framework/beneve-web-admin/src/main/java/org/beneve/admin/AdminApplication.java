package org.beneve.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @ClassName: AdminApplication 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author WangYiwen
 * @date 2016年7月9日 下午6:06:45 
 * 
 */
@SpringBootApplication
public class AdminApplication {

	/**
	 * 
	 * @Title: main 
	 * @Description : 后台管理项目主方法<后期会替换为 war 包启动的形式>
	 * @param args    设定文件 
	 * @return void    返回类型
	 * @throws 
	 *
	 * @author : WangYiwen
	 * @mail : 514094893@qq.com
	 * @Date : 2016年7月9日
	 * 
	 */
	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}

}
