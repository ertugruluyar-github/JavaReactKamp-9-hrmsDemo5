package com.kodlamaio.hrmsDemo5.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodlamaio.hrmsDemo5.entities.concretes.Employer;

@Repository
public interface EmployerDao extends JpaRepository<Employer, Integer> {
	boolean existsEmployerByEmail(String email);
}
