package by.java.acad.eugene;

public class Task10 {

	public static void main(String[] args) {
		
        double x;
        double y;

        double z;

        x = 5;
        y = 2;

        z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
       
        System.out.println("z = " + z);
    }
}