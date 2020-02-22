package com.jal.services;

public interface IAccountService {
	double getBalance(String accountNo, String accountType);

	boolean closeAccount(String reason);
}
