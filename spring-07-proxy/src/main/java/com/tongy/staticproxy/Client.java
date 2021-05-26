
package com.tongy.staticproxy;

// 静态代理模式：将一些公共的、新增的内容加到代理中，让真实对象只做自己的事情
public class Client {

  public static void main(String[] args) {
    UserSerivce userSerivce = new UserServiceImpl();

    UserServiceProxy proxy = new UserServiceProxy();
    proxy.setUserSerivce(userSerivce);
    proxy.add();
  }

}
