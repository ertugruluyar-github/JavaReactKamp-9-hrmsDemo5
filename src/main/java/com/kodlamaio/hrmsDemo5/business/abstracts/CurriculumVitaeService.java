package com.kodlamaio.hrmsDemo5.business.abstracts;

import java.util.List;

import com.kodlamaio.hrmsDemo5.core.utilities.result.concretes.DataResult;
import com.kodlamaio.hrmsDemo5.core.utilities.result.concretes.Result;
import com.kodlamaio.hrmsDemo5.entities.concretes.CurriculumVitae;

public interface CurriculumVitaeService {
	DataResult<List<CurriculumVitae>> getAll();
	DataResult<CurriculumVitae> get(int id);
	Result add(CurriculumVitae curriculumVitae);
	Result delete(int id);
	Result update(CurriculumVitae curriculumVitae);

	DataResult<String> uploadPhoto(Integer id, String filePath);
}
