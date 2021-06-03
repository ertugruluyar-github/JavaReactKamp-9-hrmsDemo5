package com.kodlamaio.hrmsDemo5.business.abstracts;

import java.util.List;

import com.kodlamaio.hrmsDemo5.core.utilities.result.concretes.DataResult;
import com.kodlamaio.hrmsDemo5.core.utilities.result.concretes.Result;
import com.kodlamaio.hrmsDemo5.entities.concretes.PhoneNumber;

public interface PhoneNumberService {
	DataResult<List<PhoneNumber>> getAll();
	DataResult<PhoneNumber> get(int id);
	Result add(PhoneNumber phoneNumber);
	Result delete(int id);
	Result update(PhoneNumber phoneNumber);
}
