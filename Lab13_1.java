package assignment;

public class Lab13_1 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("Lab13_1");
		t.setPriority(8);
		System.out.println(t);
	}
}
