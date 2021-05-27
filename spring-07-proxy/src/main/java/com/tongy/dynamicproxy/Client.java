package com.tongy.dynamicproxy;

public class Client {

    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();

    }
}
