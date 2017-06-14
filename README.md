# SpringQS(Beta版正式命名)
+ 一个基于Spring的通用“空想”开发框架，使用了RESTful进行设计
+ 此项目是坑，若想学习Spring请移步generator-jhipster或springside4
## 主要技术
+ Spring Boot
+ Spring Data
+ Spring Security（未来）
+ Spring rest
+ MapStruct（可能会放弃，原因是目前不支持Java 8，和其他第三方库组合可能产生问题，官方的文档有详细的解释）
## 进度
+ 应付暑期实习招聘，暂时停止更新，估计简历会被刷，好伤心，反正也没人会看这里啦,接下来可能要注重整个知识体系的学习，不然容易让问成塞子
+ 原本以为对Spring有足够的了解，但现在发现Spring的核心是对于数据流的处理和整体的设计，这是灵魂，我目前还无法操控，只能证明我能够粗钱的运用，还是无法写出有灵魂的代码，这不是我要的
+ 将来要整合进来的springfox，swagger-core和Activiti目前停止，写一个天花乱坠的框架而不了解原理不是我要的，金玉其外，败絮其中，参照文档堆代码并不难
+ 接下来我会专注与Spring源码的和设计的研究，整合OAuth2 和 Spring Security，和Spring充分耦合一直是我的目的，不会采用简单的一个过滤器、拦截器或切面这种方案
+ Spring Boot和Spring隐藏了太多的细节，要实现真正的动态功能需要非常熟悉Spring的源码和Java
+ 是时候读<<Java编程思想>>来重新理解Java
+ 未来还要增加异步机制，这样有数据变更服务器主动推送给客户端，免去刷新，这一部分目前只有理论参考，和前端紧密联系，将会非常艰苦
+ HTTP的每一个字段将来我都会利用，我不是算法工程师，但我会尽力将逻辑和架构优化到我的极致
+ 通用Controller基本已封装完毕，Service也基本封装完毕，思路上使用了Java 8的默认接口而不是继承，因为CRUD方法被分开，无法使用多继承
+ 由于太忙，各部分文档一直没有时间写，也经历了大大小小的不停重构，DTO层的增加等，
+ 目前正在进行统一的异常处理,目前只处理了两个异常（EntityNotFound和EntityExists），更多的异常交给Spring来处理，也可以将异常转换为自定义异常的格式
+ 各层之间应有隔离，对于传来的数据应全部进行验证，由于忙这部分先忽略
+ 由于使用了默认接口，导致log无法使用，这个基本没有影响，所有log计划通过aop来处理
+ 为后台准备的SPA前端element-admin由于时间不足，停止开发，数据的测试使用Postman和log进行测试
+ 为了应对更细的权限颗粒度控制，数据库的基本表可能增至7张并重新设计，至于权限树的处理也在考虑中
+ 数据源暂时不分离，后续版本会将认证的数据源分离出来
+ 缓存部分可能不采用Spring自带而使用Redis
+ 会逐步加入对于NoSQL数据库的支持
+ Spring Data中也有匪夷所思的地方，诸如关联表的save方法，具体的问题我会再做说明，要达到真正的自定义和动态，封装关键异常目前对我来说还有困难
+ Service层未来会使用Optional作为返回类型来应对null异常
## 问题
+ 由于大量使用了泛型，又使用了默认接口导致无法获取类名，这是由于Java的类型擦除所致，几乎没有解决方案
+ 有趣的一点是先实例化一个泛型对象（如调用findOne返回一个对象）调用getClass()方法可以获得类名
+ 这个框架使用我所学到的几乎所有技术（Java 8的部分新特性, 反射），在没有足够经验的情况下，参考许多开源框架、中英文资料写这么复杂的框架的确很难
+ 动态的权限控制和CRUD的颗粒度控制还在准备中，Spring Security的权限控制并不足以支撑复杂的权限控制，原先导致动态控制失败的原因是关于安全的Filter
先于DAO层repository的加载，导致repository还没有注入产生null异常，具体的解决的方案还在研究中，目前估计要重写好几个类来实现细致的颗粒度
