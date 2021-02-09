package com.thinkitive.model;

public class Teacher {

	private Integer teacherId;
	private String teacherName;
	private String teacherUsername;
	private String teacherPassword;
	private String teacherSecurityQuestion;
	private String teacherSecurityAnswer;
	private Boolean adminApprovalTeacher;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(Integer teacherId, String teacherName, String teacherUsername, String teacherPassword,
			String teacherSecurityQuestion, String teacherSecurityAnswer, Boolean adminApprovalTeacher) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherUsername = teacherUsername;
		this.teacherPassword = teacherPassword;
		this.teacherSecurityQuestion = teacherSecurityQuestion;
		this.teacherSecurityAnswer = teacherSecurityAnswer;
		this.adminApprovalTeacher = adminApprovalTeacher;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherUsername() {
		return teacherUsername;
	}

	public void setTeacherUsername(String teacherUsername) {
		this.teacherUsername = teacherUsername;
	}

	public String getTeacherPassword() {
		return teacherPassword;
	}

	public void setTeacherPassword(String teacherPassword) {
		this.teacherPassword = teacherPassword;
	}

	public String getTeacherSecurityQuestion() {
		return teacherSecurityQuestion;
	}

	public void setTeacherSecurityQuestion(String teacherSecurityQuestion) {
		this.teacherSecurityQuestion = teacherSecurityQuestion;
	}

	public String getTeacherSecurityAnswer() {
		return teacherSecurityAnswer;
	}

	public void setTeacherSecurityAnswer(String teacherSecurityAnswer) {
		this.teacherSecurityAnswer = teacherSecurityAnswer;
	}

	public Boolean getAdminApprovalTeacher() {
		return adminApprovalTeacher;
	}

	public void setAdminApprovalTeacher(Boolean adminApprovalTeacher) {
		this.adminApprovalTeacher = adminApprovalTeacher;
	}

	@Override
	public String toString() {
		return "[teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherUsername="
				+ teacherUsername + ", teacherPassword=" + teacherPassword + ", teacherSecurityQuestion="
				+ teacherSecurityQuestion + ", teacherSecurityAnswer=" + teacherSecurityAnswer
				+ ", adminApprovalTeacher=" + adminApprovalTeacher + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((teacherId == null) ? 0 : teacherId.hashCode());
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
		Teacher other = (Teacher) obj;
		if (teacherId == null) {
			if (other.teacherId != null)
				return false;
		} else if (!teacherId.equals(other.teacherId))
			return false;
		return true;
	}

	
	
}
