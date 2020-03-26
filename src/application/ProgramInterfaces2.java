package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class ProgramInterfaces2 {

	public static void main(String[] args) {
	
		AbstractShape sh1 = new Circle(Color.BLACK, 2.0);
		AbstractShape sh2 = new Rectangle(Color.BLACK, 3.0, 4.0);
		
		System.out.println("Circle color: " + sh1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", sh1.area()));
		System.out.println("Rectangle color: " + sh2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", sh2.area()));
	}
}
