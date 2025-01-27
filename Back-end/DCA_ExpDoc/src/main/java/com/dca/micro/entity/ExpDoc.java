package com.dca.micro.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name="experience_documents")
public class ExpDoc {

	@Id
	private String experience_id;
	private String hospital_name;
	private LocalDate start_from;
	private LocalDate end_to;
	
	@ManyToMany
	private String doctor_id;
	
	@Lob
	private byte[] exp_letter;
	
	public ExpDoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExpDoc(String hospital_name, LocalDate start_from, LocalDate end_to, String doctor_id, byte[] exp_letter) {
		super();
		this.hospital_name = hospital_name;
		this.start_from = start_from;
		this.end_to = end_to;
		this.doctor_id = doctor_id;
		this.exp_letter = exp_letter;
	}
	public ExpDoc(String experience_id, String hospital_name, LocalDate start_from, LocalDate end_to, String doctor_id,
			byte[] exp_letter) {
		super();
		this.experience_id = experience_id;
		this.hospital_name = hospital_name;
		this.start_from = start_from;
		this.end_to = end_to;
		this.doctor_id = doctor_id;
		this.exp_letter = exp_letter;
	}
	public String getExperience_id() {
		return experience_id;
	}
	public void setExperience_id(String experience_id) {
		this.experience_id = experience_id;
	}
	public String getHospital_name() {
		return hospital_name;
	}
	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}
	public LocalDate getStart_from() {
		return start_from;
	}
	public void setStart_from(LocalDate start_from) {
		this.start_from = start_from;
	}
	public LocalDate getEnd_to() {
		return end_to;
	}
	public void setEnd_to(LocalDate end_to) {
		this.end_to = end_to;
	}
	public String getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(String doctor_id) {
		this.doctor_id = doctor_id;
	}
	
}
