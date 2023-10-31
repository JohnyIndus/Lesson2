package by.java.acad.eugene;

public class Task19 {

	public static void main(String[] args) {
		
//		r1-вписанный радиус r2-наружный
		
        double side;
        double area;
        double r1;
        double r2;
        double height;

        side = 7;
        
        area = Math.pow(side, 2) * Math.sqrt(3) / 4;
        
        r1 = side * Math.sqrt(3) / 6;
        
        r2 = side * Math.sqrt(3) / 3;
        
        height = side * Math.sqrt(3) / 2;
        
        System.out.println("area = " + area);
        
        System.out.println("int = " + r1);
        
        System.out.println("outer = " + r2);
        
        System.out.println("height = " + height);
    }
}