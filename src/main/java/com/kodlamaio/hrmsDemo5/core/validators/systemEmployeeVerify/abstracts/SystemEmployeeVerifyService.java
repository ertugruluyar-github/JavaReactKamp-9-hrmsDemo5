package com.kodlamaio.hrmsDemo5.core.validators.systemEmployeeVerify.abstracts;

import com.kodlamaio.hrmsDemo5.entities.concretes.Employer;

public interface SystemEmployeeVerifyService {
	boolean hasVerifyBySystemEmployee(Employer employer);
}
