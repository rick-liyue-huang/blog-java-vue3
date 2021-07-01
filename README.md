
# blog-java-vue3
using java and vue3 to create one blog website

.idea 不需要处理，这是ideaj 特有的，打包也不会包括进去

.mvn 是预处理 maven的，可以不必一开始的时候就下载，项目根据这个.mvn可以在之后下载

.mvn mvnw mvnw.cmd 这三个文件一般用不到，一般使用自己的

mvnw.cmd 是对应的 windows命令
mvnw 是对应的linux命令

代码是写在 main/java中
里面有一个启动类

main/resources里面有配置类，包括前端的文件
js css 放到 /resources/static中，
template 中放入的是 模板，建议使用Thymeleaf 

但是这里，是前后端分离的，因此这里面的前端文件资源是不需要的

resources/application.properties是配置文件，spring boot至少有8个配置文件

pom.xml是maven的核心文件，maven管理架构包就是通过这个管理的。

wiki.iml 是项目特有文件，不需要提交到git

springboot 不需要配置容器，是因为使用了嵌入式的容器，默认使用tomcat启动，默认端口是8080, 当然用传统的方式也可以，打包成war，然后放入单独的tomcat中也是可以的。

springboot项目使用main函数启动，一般放在xxxApplication,需要加@SpringBootApplication注解
Maven Wrapper可以不需要提前下载好Maven, 由它去下载Maven

java web 经常有容器的概念，用于启动java web项目，常见的容器有 tomcat, netty, jboss, weblogic

一些自动化打包的场景可以用这个Maven Wrapper, 流水线，自动拉代码，自动下载maven，自动编译打包

如果项目异常，但又不是代码的问题，可以尝试用一下，比如IDEA不能识别Maven项目

关闭项目
删除根目录下的.idea文件夹
重新打开项目

实际的工作中，每一次的项目迭代可以建立一个分支，上线后再合并到main分支

http/test.http 用来测试接口

resources/application.properties
resources/config/application.properties
resources/application.yml
resources/config/application.yml
这些位置的配置文件都是可以自动识别的

这里应该注意：

单个的springboot不会读取boostrap.properties配置文件，要SpringCloud架构下的SpringBoot应用才会读取

bootstrap一般用于动态配置，线上可以实时修改实时生效的配置，一般结合nacos使用

在配置项中我们可以手动配置也可以在注解中设置默认值 `@Value("${test.hello:TEST}")` 这样在使用中就可以改变。


创建数据库 
用户名wiki wiki

mybatis 是持久层的处理工具，和数据库交互的就叫做持久层
还有业务层和表现层
常见的齿距层框架： mybaits hibernate 
Mybatis 需要自己写sql 式半自动的

对于和数据库连接的文件放入到 domain或者 entity,POJO,这一层的实体类就是和数据库的一一映射

接口定义在 mapper文件夹中

/resources/mapper 中放入 sql脚本 

source/ 用来写入逻辑代码

程序的接口入口实在 Controller/TestController
然后访问
```
@RequestMapping("/test/list")
	public List<Test> list() {
		return testService.list();
	}
```

这个方法会调用 testService,然后在里面会调用 mapper/TestMapper这一层

再然后 通过application.properties的设置会找到
resources/mapper/TestMapper.xml 执行里面的sql语句
而domain是和sql的属性相对应的 。




