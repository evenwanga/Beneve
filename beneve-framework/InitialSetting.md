## 初始化配置

# Eclipse
1、修改用户名 ： user
    打开 eclipse.ini ，在 -vmargs 下添加 -Duser.name=你的名字
    重启 eclipse
    
2、设置 eclipse 注释 ： Window->Preference->Java->Code Style->Code Template
    展开 Comments 节点，依次修改
    
文件(Files)注释标签：
/**   
 * @Title: ${file_name} 
 * @Package ${package_name} 
 * @Description: ${todo}(用一句话描述该文件做什么) 
 * @author ${user}   
 * @date ${date} ${time}   
 */
 
类型(Types)注释标签（类的注释）：
/** 
 * @ClassName: ${type_name} 
 * @Description: ${todo}(这里用一句话描述这个类的作用) 
 * @author ${user}
 * @date ${date} ${time} 
 * 
 * ${tags} 
 */
 
字段(Fields)注释标签：
/** 
 * @Fields ${field} : ${todo}(用一句话描述这个变量表示什么) 
 */
 
构造函数(Constructor)标签：
/** 
 * <p>Title: </p> 
 * <p>Description: </p> 
 * ${tags} 
 */
 
方法(Methods)标签：
/**
 * @Title: ${enclosing_method} 
 * @Description : ${todo} (这里用一句话描述这个方法的作用)
 * ${tags}    设定文件 
 * @return ${return_type}    返回类型
 * @throws 
 *
 * @author : ${user}
 * @mail : 514094893@qq.com
 * @Date : ${date}
 */
 
覆盖方法(Overriding Methods)标签：
/* (非 Javadoc) 
 * <p>Title: ${enclosing_method}</p> 
 * <p>Description: </p> 
 * ${tags} 
 * ${see_to_overridden} 
 */
 
代表方法(Delegate Methods)标签：
/**
 * ${tags}
 * ${see_to_target}
 */
 
getter方法标签：
/** 
 * @return ${bare_field_name} 
 */
 
setter方法标签：
/** 
 * @param ${param} 要设置的 ${bare_field_name} 
 */