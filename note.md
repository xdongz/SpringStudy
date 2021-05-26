#### bean.xml约束
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xmlns:context="http://www.springframework.org/schema/context"
  xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

  <context:annotation-config/>
  
</beans>


#### 注解说明

@Annotation: 通过byType的方式实现，而且必须要求这个对象存在
             如果同一个Type下有多个name，就通过@Qualifier(value="XXX")来区分name

@Nullable: 字段标记了这个注解，说明这个字段可以为null

@Resource: 默认通过byName的方式实现，如果找不到名字，则通过byType实现，如果两个都找不到的情况下
           就报错

@Component: 组件，放在类上，说明这个类被Spring管理了,就是Bean
            有几个衍生注解。在web开发中，会按照mvc三层架构分层
            * dao [@Repository]
            * service [@Service]
            * controller [@Controller]
            
            这四个注解功能都是一样的，都是代表将某个类注册到Spring中，装配Bean

xml与注解的最佳实践：           
xml用来管理bean，注解只负责完成属性的的注入        
           
           