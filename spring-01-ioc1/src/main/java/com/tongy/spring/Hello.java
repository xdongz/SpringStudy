
package com.tongy.spring;

public class Hello {

  private String str;

  public Hello(String str) {
    this.str = str;
  }

  public String getStr() {
    return str;
  }

  @Override
  public String toString() {
    return "Hello{" +
        "str='" + str + '\'' +
        '}';
  }
}
