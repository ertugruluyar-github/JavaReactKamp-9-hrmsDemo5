package com.kodlamaio.hrmsDemo5.business.abstracts;

import java.util.List;

import com.kodlamaio.hrmsDemo5.core.utilities.result.concretes.DataResult;
import com.kodlamaio.hrmsDemo5.core.utilities.result.concretes.Result;
import com.kodlamaio.hrmsDemo5.entities.concretes.School;

public interface SchoolService {
	DataResult<List<School>> getAll();
	DataResult<School> get(int id);
	Result add(School school);
	Result delete(int id);
	Result update(School school);
	
	DataResult<List<School>> getAllOrderByEndDateDesc();
	DataResult<List<School>> getByEndDateIsNull();
	DataResult<List<School>> getByEndDateIsNotNullOrderByEndDateDesc();
}
