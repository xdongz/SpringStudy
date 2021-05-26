
package com.tongy.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 等价于 <bean id="user" class="com.tongy.spring.User"/>
@Component
@Scope(value="prototype")
public class User {

  // 相当于 <property name="name" value="Alice"/>
  @Value("Alice")
  public String name;

}
