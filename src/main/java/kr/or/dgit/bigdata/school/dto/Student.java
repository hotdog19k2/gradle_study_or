package kr.or.dgit.bigdata.school.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	private int studId;
	private String name;
	private String email;
	private PhonNumber phon;
	private Date dob;
	
	public Student() {}

	public Student(int studId, String name, String email, Date dob,PhonNumber phon) {
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.phon = phon;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	
	public PhonNumber getPhon() {
		return phon;
	}

	public void setPhon(PhonNumber phon) {
		this.phon = phon;
	}

	@Override
	public String toString() {
		return String.format("Student [studId=%s, name=%s, email=%s, dob=%s,phon=%s]", studId, name, email, dob,phon);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + studId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (studId != other.studId)
			return false;
		return true;
	}


}
