package observableAPI;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student("John", 2.0);
		GPAObserver observer1 = new GPAObserver(s);
		s.setGpa(1.0);
		GPAObserver observer2 = new GPAObserver(s);
		s.setGpa(3.0);
		s.setName("Jane");
		s.setGpa(4.0);
	}

}
