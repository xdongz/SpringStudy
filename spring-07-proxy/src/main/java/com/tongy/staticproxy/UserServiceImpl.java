
package com.tongy.staticproxy;

public class UserServiceImpl implements UserSerivce {


  @Override
  public void add() {
    System.out.println("增加了一些东西");
  }

  @Override
  public void delete() {
    System.out.println("删除了一些东西");
  }

  @Override
  public void update() {
    System.out.println("修改了一些东西");
  }

  @Override
  public void query() {
    System.out.println("查询一些东西");
  }
}
