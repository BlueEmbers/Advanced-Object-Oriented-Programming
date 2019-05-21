package observableAPI;

import java.util.Observable;
import java.util.Observer;

public class GPAObserver implements Observer {
//	private String name;
//	private double gpa;
	private static int observerIDTracker = 0;
	private int observerID;
	private Student student;

	public GPAObserver(Student student) {
		this.student = student;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer: " + this.observerID);
		this.student.addObserver(this);
	}

	public void update(Observable student, Object arg) {
		System.out.println(((Student) (student)).getName() + ": " + ((Student) student).getGpa());
		System.out.println(arg);
	}
}
