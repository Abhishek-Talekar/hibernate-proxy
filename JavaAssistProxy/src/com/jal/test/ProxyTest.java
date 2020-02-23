package com.jal.test;

import java.lang.reflect.Proxy;

import com.jal.handler.SecurityInvocationHandler;
import com.jal.services.AccountServiceImpl;
import com.jal.services.IAccountService;

public class ProxyTest {
	public static void main(String[] args) {
		SecurityInvocationHandler handler = new SecurityInvocationHandler();
		IAccountService proxy = (IAccountService) Proxy.newProxyInstance(IAccountService.class.getClassLoader(), new Class[] {IAccountService.class}, handler);
		//AccountServiceImpl accountServiceImpl = new AccountServiceImpl();
		double balance = proxy.getBalance("2209", "Close");
		System.out.println(balance);
		boolean status = proxy.closeAccount("something");
		System.out.println(status);
	}
}
