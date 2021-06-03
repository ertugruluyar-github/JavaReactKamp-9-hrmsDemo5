package com.kodlamaio.hrmsDemo5.core.adapters.concretes;

import org.springframework.stereotype.Service;

import com.kodlamaio.hrmsDemo5.core.adapters.abstracts.JobSeekerValidationService;
import com.kodlamaio.hrmsDemo5.entities.concretes.JobSeeker;
import com.kodlamaio.hrmsDemo5.externalServices.mernis.MernisValidation;

@Service
public class MernisValidationAdapter implements JobSeekerValidationService {

	@Override
	public boolean isRealPerson(JobSeeker jobSeeker) {
		return new MernisValidation().isRealPerson(jobSeeker.getFirstName(), jobSeeker.getLastName(),
				Long.parseLong(jobSeeker.getNationalityId()));
	}

}
