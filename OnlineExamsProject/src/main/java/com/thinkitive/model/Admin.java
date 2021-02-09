package com.thinkitive.model;

public class Admin {

	private Integer adminId;
	private String adminName;
	private String adminUsername;
	private String adminPassword;
	private String adminSecurityQuestion;
	private String adminSecurityAnswer;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(Integer adminId, String adminName, String adminUsername, String adminPassword,
			String adminSecurityQuestion, String adminSecurityAnswer) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminUsername = adminUsername;
		this.adminPassword = adminPassword;
		this.adminSecurityQuestion = adminSecurityQuestion;
		this.adminSecurityAnswer = adminSecurityAnswer;
	}
	
	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminUsername() {
		return adminUsername;
	}

	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminSecurityQuestion() {
		return adminSecurityQuestion;
	}

	public void setAdminSecurityQuestion(String adminSecurityQuestion) {
		this.adminSecurityQuestion = adminSecurityQuestion;
	}

	public String getAdminSecurityAnswer() {
		return adminSecurityAnswer;
	}

	public void setAdminSecurityAnswer(String adminSecurityAnswer) {
		this.adminSecurityAnswer = adminSecurityAnswer;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminUsername=" + adminUsername
				+ ", adminPassword=" + adminPassword + ", adminSecurityQuestion=" + adminSecurityQuestion
				+ ", adminSecurityAnswer=" + adminSecurityAnswer + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminId == null) ? 0 : adminId.hashCode());
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
		Admin other = (Admin) obj;
		if (adminId == null) {
			if (other.adminId != null)
				return false;
		} else if (!adminId.equals(other.adminId))
			return false;
		return true;
	}
	
	
}
