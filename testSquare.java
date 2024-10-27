package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSquare {

	@Test
	void testDistance() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,0);
		assertEquals(p1.distance(p2),1);
	}

	@Test
	void testNotSquare() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(2,0);
		Point p3 = new Point(2,1);
		Point p4 = new Point(0,1);
		Square square = new Square(p1, p2, p3, p4);
		assertFalse(square.IsSquare());
	}
	
	@Test
	void testPerimeter() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,0);
		Point p3 = new Point(1,1);
		Point p4 = new Point(0,1);
		Square square = new Square(p1, p2, p3, p4);
		assertEquals(4.0, square.perimeter(), 0.001);
	}

}
