package com.kodlamaio.hrmsDemo5.core.validators.systemEmployeeVerify.abstracts;

import com.kodlamaio.hrmsDemo5.entities.concretes.Employer;

/**
 * @author Ertuğrul Uyar
 * @LinkedIn www.linkedin.com/in/ertugruluyar
 * @GitHub https://github.com/euyar42
 */
public abstract class EmployerSystemEmployeeVerifyService implements SystemEmployeeVerifyService {

	@Override // default verify
	public boolean hasVerifyBySystemEmployee(Employer employer) {
		return true;
	}

}
