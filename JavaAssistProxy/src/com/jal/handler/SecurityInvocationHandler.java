package com.jal.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SecurityInvocationHandler implements InvocationHandler{

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object obj;
		if(method.getName().equals("getBalance")) {
			System.out.println("Security Verified");
			
		}
		return null;
	}

}
