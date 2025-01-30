package com.dac.aop.micro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Doctor")
public class DCA_Doctor {

	@Id
	private String doctorId;

	private String fullname;
	private String email;
	private String contact;
	private String qualification;
	private String speciality;
	private String experience;
	private String gender;
	private String experienceId;
//	private String hospital_name;
//	private String start_from;
//	private String end_to;

//	@Lob
//	private byte[] exp_letter;

	@Lob
	private byte[] DoctorLicense;

	private String userId;
	private String patientId;
	private String appointmentId;
	private String receptionistId;

	@Transient
	private DCA_User user;

	@Transient
	private DCA_Appointment appointment;

	@Transient
	private DCA_Patient patient;

	@Transient
	private DCA_Receptionist receptionist;

	@Transient
	private DCA_ExpDoc dca_ExpDoc;

	public DCA_Doctor() {
		super();
	}

	public DCA_Doctor(String doctorId, String fullname, String email, String contact, String qualification,
			String speciality, String experience, String gender, String experienceId, String hospital_name,
			String start_from, String end_to, byte[] exp_letter, byte[] doctorLicense, String userId, String patientId,
			String appointmentId, String receptionistId, DCA_User user, DCA_Appointment appointment,
			DCA_Patient patient, DCA_Receptionist receptionist) {
		super();
		this.doctorId = doctorId;
		this.fullname = fullname;
		this.email = email;
		this.contact = contact;
		this.qualification = qualification;
		this.speciality = speciality;
		this.experience = experience;
		this.gender = gender;
		this.experienceId = experienceId;
//		this.hospital_name = hospital_name;
//		this.start_from = start_from;
//		this.end_to = end_to;
//		this.exp_letter = exp_letter;
		DoctorLicense = doctorLicense;
		this.userId = userId;
		this.patientId = patientId;
		this.appointmentId = appointmentId;
		this.receptionistId = receptionistId;
//		this.user = user;
//		this.appointment = appointment;
//		this.patient = patient;
//		this.receptionist = receptionist ;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSpecality() {
		return speciality;
	}

	public void setSpecality(String specality) {
		this.speciality = specality;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getExperienceId() {
		return experienceId;
	}

	public void setExperienceId(String experienceId) {
		this.experienceId = experienceId;
	}

//	public String getHospital_name() {+++
//		return hospital_name;
//	}
//
//	public void setHospital_name(String hospital_name) {
//		this.hospital_name = hospital_name;
//	}
//
//	public String getStart_from() {
//		return start_from;
//	}
//
//	public void setStart_from(String start_from) {
//		this.start_from = start_from;
//	}
//
//	public String getEnd_to() {
//		return end_to;
//	}
//
//	public void setEnd_to(String end_to) {
//		this.end_to = end_to;
//	}
//
//	public byte[] getExp_letter() {
//		return exp_letter;
//	}
//
//	public void setExp_letter(byte[] exp_letter) {
//		this.exp_letter = exp_letter;
//	}

	public byte[] getDoctorLicense() {
		return DoctorLicense;
	}

	public void setDoctorLicense(byte[] doctorLicense) {
		DoctorLicense = doctorLicense;
	}

	public String getuserId() {
		return userId;
	}

	public void setUser_id(String userId) {
		this.userId = userId;
	}

	public String getpatientId() {
		return patientId;
	}

	public void setpatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getappointmentId() {
		return appointmentId;
	}

	public void setAppointment_id(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getReceptionist_id() {
		return receptionistId;
	}

	public void setreceptionistId(String receptionistId) {
		this.receptionistId = receptionistId;
	}

	public DCA_User getUser() {
		return user;
	}

	public void setUser(DCA_User user) {
		this.user = user;
	}

	public DCA_Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(DCA_Appointment appointment) {
		this.appointment = appointment;
	}

	public DCA_Patient getPatient() {
		return patient;
	}

	public void setPatient(DCA_Patient patient) {
		this.patient = patient;
	}

	public DCA_Receptionist getReceptionist() {
		return receptionist;
	}

	public void setReceptionist(DCA_Receptionist receptionist) {
		this.receptionist = receptionist;
	}

}
