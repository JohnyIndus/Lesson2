package by.java.acad.eugene;

public class Task12 {

	public static void main(String[] args) {
		
		double x1;
		double y1;
		double x2;
		double y2;

		double l;

		x1 = 2;
		x2 = 4;
		y1 = 6;
		y2 = 8;

		l = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
		
		System.out.println("l = " + l);
	}
}