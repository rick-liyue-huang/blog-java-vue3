
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


