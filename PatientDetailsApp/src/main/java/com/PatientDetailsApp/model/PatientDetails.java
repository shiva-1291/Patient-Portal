package com.PatientDetailsApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDetails {
	@Id
    @GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String gender;
	private long phoneNumber;
	private String emailID;
	private String reason;
}
