package kr.ac.hansung.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Course {
	private int year;
	private int term;
	private String subject;
	private String subjectCode;
	private String separation;
	private int credit;
	
	
	public Course(){
		
	}
	
	public Course(int year, int term, String subject, String subjectCode, String separation, int credit) {
		super();
		this.year = year;
		this.term = term;
		this.subject = subject;
		this.subjectCode = subjectCode;
		this.separation = separation;
		this.credit = credit;
	}


	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSeparation() {
		return separation;
	}

	public void setSeparation(String separation) {
		this.separation = separation;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}


	
}