/*
 * Copyright 2021 Synopsys Inc. All rights reserved.
 * This file is confidential material. Unauthorized distribution prohibited.
 */
package com.tongy.staticproxy;

public class UserServiceProxy implements UserSerivce {

  private UserSerivce userSerivce;

  public void setUserSerivce(UserSerivce userSerivce) {
    this.userSerivce = userSerivce;
  }

  @Override
  public void add() {
    System.out.println("add...");
    userSerivce.add();
  }

  @Override
  public void delete() {
    System.out.println("delete...");
    userSerivce.delete();
  }

  @Override
  public void update() {
    System.out.println("update...");
    userSerivce.update();
  }

  @Override
  public void query() {
    System.out.println("query...");
    userSerivce.query();
  }
}
