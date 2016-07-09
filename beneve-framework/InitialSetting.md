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
 
构造函数标签：