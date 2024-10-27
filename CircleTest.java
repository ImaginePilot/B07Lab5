package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void testHashCode() {
		Circle c1=new Circle(2,new Point(0,0));
		Circle c2=new Circle(2,new Point(0,0));
		assertEquals(c1.hashCode(),c2.hashCode());
		Circle c3=new Circle(2,new Point(0,0));
		Circle c4=new Circle(2,new Point(1,1));
		assertTrue(c3.hashCode()!=c4.hashCode());
	}

	@Test
	void testCircle() {
		Circle c=new Circle(2,new Point(0,0));
		assertTrue(true);
	}

	@Test
	void testComputeCircumference() {
		Circle c=new Circle(2,new Point(0,0));
		assertEquals(c.computeCircumference(),2*Math.PI*c.radius);
	}

	@Test
	void testComputeArea() {
		Circle c=new Circle(2,new Point(0,0));
		assertEquals(c.computeArea(),Math.PI*c.radius*c.radius);
	}

	@Test
	void testEqualsObject() {
		Circle c1=new Circle(2,new Point(0,0));
		Circle c2=new Circle(2,new Point(0,0));
		Circle c3=new Circle(3,new Point(0,0));
		Circle c4=new Circle(2,new Point(1,1));
		assertTrue(c1.equals(c1));
		assertFalse(c1.equals(null));
		assertFalse(c1.equals(new Point(0,0)));
		assertFalse(c1.equals(c3));
		assertTrue(c1.equals(c2));
		assertFalse(c1.equals(c4));
	}

}
