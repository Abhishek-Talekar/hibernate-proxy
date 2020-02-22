package com.jal.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SecurityInvocationHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Class clazz = null;
		Object obj = null;
		if (method.getName().equals("getBalance")) {
			System.out.println("Security Verified");
			method.invoke(proxy, args);
			clazz.getClass().isInstance(obj);
			return obj;
		}
		return null;
	}

}
