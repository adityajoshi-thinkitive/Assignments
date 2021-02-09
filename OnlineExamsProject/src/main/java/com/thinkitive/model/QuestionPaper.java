package com.thinkitive.model;

import java.util.Set;

public class QuestionPaper {

	private Integer questionPaperId;
	private Set<Question> questionList;
	
	public QuestionPaper() {
		// TODO Auto-generated constructor stub
	}

	public QuestionPaper(Integer questionPaperId, Set<Question> questionList) {
		super();
		this.questionPaperId = questionPaperId;
		this.questionList = questionList;
	}

	public Integer getQuestionPaperId() {
		return questionPaperId;
	}

	public void setQuestionPaperId(Integer questionPaperId) {
		this.questionPaperId = questionPaperId;
	}

	public Set<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(Set<Question> questionList) {
		this.questionList = questionList;
	}

	@Override
	public String toString() {
		return "QuestionPaper [questionPaperId=" + questionPaperId + ", questionList=" + questionList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((questionPaperId == null) ? 0 : questionPaperId.hashCode());
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
		QuestionPaper other = (QuestionPaper) obj;
		if (questionPaperId == null) {
			if (other.questionPaperId != null)
				return false;
		} else if (!questionPaperId.equals(other.questionPaperId))
			return false;
		return true;
	}

	
	
}
