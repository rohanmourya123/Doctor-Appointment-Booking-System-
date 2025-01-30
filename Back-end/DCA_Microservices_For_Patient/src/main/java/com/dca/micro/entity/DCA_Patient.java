package com.dca.micro.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Patient")
public class DCA_Patient {

	@Id
	private String patient_Id;

	private String firstName;
	private String lastName;
	private String gender;
	private String contact;
	private LocalDate DOB;
	private String email_Id;
	private String user_Id;
	private String receptionist_Id;
	private String appointment_Id;
	private String doctor_Id;

	@Transient
	private DCA_User user;

	@Transient
	private DCA_Receptionist receptionist;

	@Transient
	private DCA_Appointment appointment;

	@Transient
	private DCA_Doctor doctor;

	@Lob
	private byte[] medicalRecords;

	public DCA_Patient() {
		super();

	}

	public DCA_Patient(String firstName, String lastName, String gender, String contact, LocalDate dOB, String email_Id,
			String user_Id, String receptionist_Id, String appointment_Id, String doctor_Id, DCA_User user,
			DCA_Receptionist receptionist, DCA_Appointment appointment, DCA_Doctor doctor, byte[] medicalRecords) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.contact = contact;
		DOB = dOB;
		this.email_Id = email_Id;
		this.user_Id = user_Id;
		this.receptionist_Id = receptionist_Id;
		this.appointment_Id = appointment_Id;
		this.doctor_Id = doctor_Id;
		this.user = user;
		this.receptionist = receptionist;
		this.appointment = appointment;
		this.doctor = doctor;
		this.medicalRecords = medicalRecords;
	}

	public DCA_Patient(String patient_Id, String firstName, String lastName, String gender, String contact,
			LocalDate dOB, String email_Id, String user_Id, String receptionist_Id, String appointment_Id,
			String doctor_Id, DCA_User user, DCA_Receptionist receptionist, DCA_Appointment appointment,
			DCA_Doctor doctor, byte[] medicalRecords) {
		super();
		this.patient_Id = patient_Id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.contact = contact;
		this.DOB = dOB;
		this.email_Id = email_Id;
		this.user_Id = user_Id;
		this.receptionist_Id = receptionist_Id;
		this.appointment_Id = appointment_Id;
		this.doctor_Id = doctor_Id;
		this.user = user;
		this.receptionist = receptionist;
		this.appointment = appointment;
		this.doctor = doctor;
		this.medicalRecords = medicalRecords;
	}

	public String getPatient_Id() {
		return patient_Id;
	}

	public void setPatient_Id(String patient_Id) {
		this.patient_Id = patient_Id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public String getEmail_Id() {
		return email_Id;
	}

	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}

	public String getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}

	public String getReceptionist_Id() {
		return receptionist_Id;
	}

	public void setReceptionist_Id(String receptionist_Id) {
		this.receptionist_Id = receptionist_Id;
	}

	public String getAppointment_Id() {
		return appointment_Id;
	}

	public void setAppointment_Id(String appointment_Id) {
		this.appointment_Id = appointment_Id;
	}

	public String getDoctor_Id() {
		return doctor_Id;
	}

	public void setDoctor_Id(String doctor_Id) {
		this.doctor_Id = doctor_Id;
	}

	public DCA_User getUser() {
		return user;
	}

	public void setUser(DCA_User user) {
		this.user = user;
	}

	public DCA_Receptionist getReceptionist() {
		return receptionist;
	}

	public void setReceptionist(DCA_Receptionist receptionist) {
		this.receptionist = receptionist;
	}

	public DCA_Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(DCA_Appointment appointment) {
		this.appointment = appointment;
	}

	public DCA_Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(DCA_Doctor doctor) {
		this.doctor = doctor;
	}

	public byte[] getMedicalRecords() {
		return medicalRecords;
	}

	public void setMedicalRecords(byte[] medicalRecords) {
		this.medicalRecords = medicalRecords;
	}

}