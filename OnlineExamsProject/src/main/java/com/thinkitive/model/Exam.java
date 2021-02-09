package com.thinkitive.model;

import java.util.List;

public class Exam {

	private Integer examId;
	private Integer studentId;
	private QuestionPaper questionPaper;
	private List<String> studentAnswers;
	private Integer marks;

	public Exam() {
		// TODO Auto-generated constructor stub
	}

	public Exam(Integer examId, Integer studentId, QuestionPaper questionPaper, List<String> studentAnswers,
			Integer marks) {
		super();
		this.examId = examId;
		this.studentId = studentId;
		this.questionPaper = questionPaper;
		this.studentAnswers = studentAnswers;
		this.marks = marks;
	}

	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public QuestionPaper getQuestionPaper() {
		return questionPaper;
	}

	public void setQuestionPaper(QuestionPaper questionPaper) {
		this.questionPaper = questionPaper;
	}

	public List<String> getStudentAnswers() {
		return studentAnswers;
	}

	public void setStudentAnswers(List<String> studentAnswers) {
		this.studentAnswers = studentAnswers;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "[examId=" + examId + ", studentId=" + studentId + ", questionPaper=" + questionPaper
				+ ", studentAnswers=" + studentAnswers + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((examId == null) ? 0 : examId.hashCode());
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
		Exam other = (Exam) obj;
		if (examId == null) {
			if (other.examId != null)
				return false;
		} else if (!examId.equals(other.examId))
			return false;
		return true;
	}

	
	
}
