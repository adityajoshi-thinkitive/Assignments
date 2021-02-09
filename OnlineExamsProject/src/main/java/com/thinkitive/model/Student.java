package com.thinkitive.model;

public class Student {

	private Integer studentId;
	private String studentName;
	private String studentUsername;
	private String studentPassword;
	private String studentSecurityQuestion;
	private String studentSecurityAnswer;
	private Boolean adminApprovalStudent;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(Integer studentId, String studentName, String studentUsername, String studentPassword,
			String studentSecurityQuestion, String studentSecurityAnswer, Boolean adminApprovalStudent) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentUsername = studentUsername;
		this.studentPassword = studentPassword;
		this.studentSecurityQuestion = studentSecurityQuestion;
		this.studentSecurityAnswer = studentSecurityAnswer;
		this.adminApprovalStudent = adminApprovalStudent;
	}


	public Integer getStudentId() {
		return studentId;
	}


	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentUsername() {
		return studentUsername;
	}


	public void setStudentUsername(String studentUsername) {
		this.studentUsername = studentUsername;
	}


	public String getStudentPassword() {
		return studentPassword;
	}


	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}


	public String getStudentSecurityQuestion() {
		return studentSecurityQuestion;
	}


	public void setStudentSecurityQuestion(String studentSecurityQuestion) {
		this.studentSecurityQuestion = studentSecurityQuestion;
	}


	public String getStudentSecurityAnswer() {
		return studentSecurityAnswer;
	}


	public void setStudentSecurityAnswer(String studentSecurityAnswer) {
		this.studentSecurityAnswer = studentSecurityAnswer;
	}


	public Boolean getAdminApprovalStudent() {
		return adminApprovalStudent;
	}


	public void setAdminApprovalStudent(Boolean adminApprovalStudent) {
		this.adminApprovalStudent = adminApprovalStudent;
	}


	@Override
	public String toString() {
		return "[studentId=" + studentId + ", studentName=" + studentName + ", studentUsername="
				+ studentUsername + ", studentPassword=" + studentPassword + ", studentSecurityQuestion="
				+ studentSecurityQuestion + ", studentSecurityAnswer=" + studentSecurityAnswer
				+ ", adminApprovalStudent=" + adminApprovalStudent + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
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
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		return true;
	}

	
}
