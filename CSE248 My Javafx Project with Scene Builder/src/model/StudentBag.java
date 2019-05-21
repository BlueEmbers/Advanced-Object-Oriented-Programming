package model;

public class StudentBag {
	private Student[] arr;
	private int nElems;
	
	public StudentBag(int maxSize) {
		arr = new Student[maxSize];
		nElems = 0;
	}
	
	public void insert(Student s) {
		arr[nElems++] = s;
	}
}
