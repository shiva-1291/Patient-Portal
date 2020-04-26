package com.PatientDetailsApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PatientDetailsApp.model.PatientDetails;

public interface PatientRepository extends JpaRepository<PatientDetails, Integer> {
	List<PatientDetails> findById(int id);
}
