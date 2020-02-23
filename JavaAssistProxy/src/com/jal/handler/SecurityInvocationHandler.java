package com.jal.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.jal.services.AccountServiceImpl;

public class SecurityInvocationHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		Class clazz = null;
//		clazz = proxy.getClass();
//		Object obj = null;
		if (method.getName().equals("getBalance")) {
			System.out.println("Security Verified");
			/*
			 * method.invoke(proxy, args); proxy.getClass().isInstance(obj); return obj;
			 */
		}
		return method.invoke(new AccountServiceImpl() , args);
	}

}
