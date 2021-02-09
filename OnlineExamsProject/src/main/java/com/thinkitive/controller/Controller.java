package com.thinkitive.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.dao.AdminDAO;
import com.thinkitive.dao.ExamDAO;
import com.thinkitive.dao.QuestionDAO;
import com.thinkitive.dao.QuestionPaperDAO;
import com.thinkitive.dao.StudentDAO;
import com.thinkitive.dao.TeacherDAO;
import com.thinkitive.model.Admin;
import com.thinkitive.model.Exam;
import com.thinkitive.model.Question;
import com.thinkitive.model.QuestionPaper;

import com.thinkitive.model.Student;
import com.thinkitive.model.Teacher;

@RestController
public class Controller {

	@Autowired
	public HttpSession session;
	
	AdminDAO addao = new AdminDAO();
	StudentDAO stdao = new StudentDAO();
	TeacherDAO tchdao = new TeacherDAO();
	QuestionDAO qdao = new QuestionDAO();
	QuestionPaperDAO qpdao = new QuestionPaperDAO();
	ExamDAO exdao = new ExamDAO();
	
	@GetMapping(value = "/student/{studentId}")
	public Student getStudent(@PathVariable("studentId") Integer studentId) {
		System.out.println("Hello In Diplay method");
		System.out.println(studentId);
		return stdao.displayStudent(studentId);
	}
	
	@GetMapping(value = "/teacher/{teacherId}")
	public Teacher getTeacher(@PathVariable("teacherId") Integer teacherId) {
		System.out.println("Hello In Diplay method");
		System.out.println(teacherId);
		return tchdao.displayTeacher(teacherId);
	}
	
	@PostMapping(value="/adminregistration")
	public Admin insertAdmin(@RequestBody Admin admin ) {
	addao.addAdmin(admin);
	return admin;
	}
	
	@PostMapping(value="/studentregistration")
	public Student insertStudent(@RequestBody Student student ) {
	stdao.addStudent(student);
	return student;
	}
	
	@PostMapping(value="/teacherregistration")
	public Teacher insertTeacher(@RequestBody Teacher teacher ) {
	tchdao.addTeacher(teacher);
	return teacher;
	}
	
	@PostMapping(value="/adminlogin")
	public Admin adminLogin(@RequestParam String adminUsername, @RequestParam String adminPassword ) {
	Admin admin = addao.displayAdmin();
	if(admin.getAdminUsername().equals(adminUsername) && admin.getAdminPassword().equals(adminPassword)){
		System.out.println("Successfully Logged In");
		session.getSessionContext();
		System.out.println(session.getId());
		session.setAttribute("adminsession", admin.getAdminId());
		return admin;
	}
	
	return new Admin();
	}
	
	@GetMapping(value = "/showstudentapprovalrequests")
	public List<Map> getStudentApprovalRequest() {
		Integer adminId = (Integer) session.getAttribute("adminsession");
		List<Map> l = null;
		if(adminId != null) {
		 l = stdao.displayStudentApprovalRequests();
		}
		return l;
	}
	
	@GetMapping(value = "/showteacherapprovalrequests")
	public List<Map> getTeacherApprovalRequest() {
		Integer adminId = (Integer) session.getAttribute("adminsession");
		List<Map> l = null;
		if(adminId != null) {
		 l = tchdao.displayTeacherApprovalRequests();
		}
		return l;
	}
	
	@PutMapping(value = "/approvestudent")
	public Student approveStudent(@RequestParam Integer studentId) {
		Integer adminId = (Integer) session.getAttribute("adminsession");
		Student student = null;
		if(adminId != null) {
		student = stdao.displayStudent(studentId);
		student.setAdminApprovalStudent(true);
		stdao.updateStudent(student);
		}
		return student;
	}
	
	@PutMapping(value = "/approveteacher")
	public Teacher approveTeacher(@RequestParam Integer teacherId) {
		Integer adminId = (Integer) session.getAttribute("adminsession");
		Teacher teacher = null;
		if(adminId != null) {
		teacher = tchdao.displayTeacher(teacherId);
		teacher.setAdminApprovalTeacher(true);
		tchdao.updateTeacher(teacher);
		}
		return teacher;
	}
	
	@PostMapping(value="/studentlogin")
	public Student studentLogin(@RequestParam String studentUsername, @RequestParam String studentPassword ) {
	List<Student> studentlist=new ArrayList<Student>();
	studentlist = stdao.displayAll();
	Boolean adminapproval = false;
	for(Student st : studentlist) {
	if(st.getStudentUsername().equals(studentUsername) && st.getStudentPassword().equals(studentPassword)){
		adminapproval = st.getAdminApprovalStudent();
		if(adminapproval) {
		System.out.println("Successfully Logged In");
		session.getSessionContext();
		System.out.println(session.getId());
		session.setAttribute("studentsession", st.getStudentId());
		return st;
		}
	}
	}
	return new Student();
	}
	
	@PostMapping(value="/teacherlogin")
	public Teacher teacherLogin(@RequestParam String teacherUsername, @RequestParam String teacherPassword ) {
	List<Teacher> teacherlist=new ArrayList<Teacher>();
	teacherlist = tchdao.displayAll();
	Boolean adminapproval = false;
	for(Teacher tch : teacherlist) {
	if(tch.getTeacherUsername().equals(teacherUsername) && tch.getTeacherPassword().equals(teacherPassword)){
		adminapproval = tch.getAdminApprovalTeacher();
		if(adminapproval) {
		System.out.println("Successfully Logged In");
		session.getSessionContext();
		System.out.println(session.getId());
		session.setAttribute("teachersession", tch.getTeacherId());
		return tch;
		}
	}
	}
	return new Teacher();
	}
	
	@PostMapping(value = "/addquestion")
	public Question insertQuestion(@RequestBody Question question) {
		Integer teacherId = (Integer) session.getAttribute("teachersession");
		if(teacherId != null) {
		System.out.println("IN save method");
		System.out.println(question);
		qdao.addQuestion(question);
		}
		return question;
	}
	
	@GetMapping(value = "/questionpaper/{questionPaperId}")
	public QuestionPaper getQuestionPaper(@PathVariable("questionPaperId") Integer questionPaperId) {
		System.out.println("Hello In Diplay method");
		System.out.println(questionPaperId);
		return qpdao.displayQuestionPaper(questionPaperId);
	}
		
	@PostMapping(value = "/addquestionpaper")
	public QuestionPaper insertQuestionPaper(@RequestBody QuestionPaper questionpaper) {
		Integer teacherId = (Integer) session.getAttribute("teachersession");
		if(teacherId != null) {
		System.out.println("IN save method");
		System.out.println(questionpaper);
		qpdao.addQuestionPaper(questionpaper);
		}
		return questionpaper;
	}
	
	@GetMapping(value = "/examstudent/{examId}")
	public Exam getExam(@PathVariable("examId") Integer examId) {
		Integer studentId = (Integer) session.getAttribute("studentsession");
		if(studentId != null) {
		System.out.println("Hello In Diplay method");
		System.out.println(examId);
		return exdao.displayExam(examId);
		}
		return new Exam();
	}
	
	
	@PostMapping(value = "/saveexam")
	public Exam insertExam(@RequestParam Integer examId, Integer questionPaperId ) {
		Exam exam = new Exam();

		Integer studentId = (Integer) session.getAttribute("studentsession");
		
		if(studentId != null) {
		System.out.println("IN save method");
		exam.setExamId(examId); exam.setStudentId(studentId); exam.setMarks(0);
		List<String> studentAnswers = new ArrayList<String>();
		for(int i =0; i<5;i++) {
		studentAnswers.add("answer"); 
		}
		exam.setStudentAnswers(studentAnswers);
		QuestionPaper questionpaper = qpdao.displayQuestionPaper(questionPaperId);
		exam.setQuestionPaper(questionpaper);
		System.out.println(exam);
		exdao.addExam(exam);
		}
		return exam;
	}
	
	@PutMapping(value = "/submitexam")
	public Exam update(@RequestBody Exam exam) {
		
		Integer studentId = (Integer) session.getAttribute("studentsession");
		
		if(studentId != null) {
		System.out.println(exam);
		List sa = exam.getStudentAnswers();
		List<Question> qlist = new ArrayList<Question>(exam.getQuestionPaper().getQuestionList());
		
		Integer marks = 0;
		for(int i = 0; i<5; i++) {
			if(sa.get(i).equals(qlist.get(i).getAnswer())) {
				marks += 2;
			}
		}
		System.out.println("Marks : "+marks);
		exam.setMarks(marks);
		exdao.updateExam(exam);
		}
		return exam;
	}
	
	@GetMapping(value = "/getresultstudent")
	public List<Map> getResultStudent() {
		Integer studentId = (Integer) session.getAttribute("studentsession");
		
		List<Map> resultlist = null;
		if(studentId != null) {
		System.out.println("In get result");
		resultlist = exdao.getResults(studentId);
		}
		return resultlist;
	}
	
	@GetMapping(value = "/getresultteacher")
	public List<Map> getResultTeacher(@RequestParam Integer studentId) {
		Integer teacherId = (Integer) session.getAttribute("teachersession");
		
		List<Map> resultlist = null;
		if(teacherId != null) {
		System.out.println("In get result");
		resultlist = exdao.getResults(studentId);
		}
		return resultlist;
	}
	
	@GetMapping(value = "/getallresultsteacher")
	public List<Map> getAllResultsTeacher() {
		Integer teacherId = (Integer) session.getAttribute("teachersession");
		
		List<Map> resultlist = null;
		if(teacherId != null) {
		System.out.println("In get result");
		resultlist = exdao.getAllResults();
		}
		return resultlist;
	}
}
