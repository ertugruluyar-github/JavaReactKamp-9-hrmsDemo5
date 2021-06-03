package com.kodlamaio.hrmsDemo5.core.adapters.abstracts;

import org.springframework.stereotype.Service;

import com.kodlamaio.hrmsDemo5.entities.concretes.JobSeeker;

@Service
public interface JobSeekerValidationService {
	boolean isRealPerson(JobSeeker jobSeeker);
}
