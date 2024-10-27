package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void testPerimeter(){
        Rectangle r1 = new Rectangle(new Point(0,2), new Point(1,2), new Point(0,0), new Point(1,0));
        assertEquals(r1.perimeter(), 6);
    }

    @Test
    void testArea(){
		Rectangle r1 = new Rectangle(new Point(0,2), new Point(1,2), new Point(0,0), new Point(1,0));
        assertEquals(r1.area(), 2);
    }

    @Test
	void testEquals() {
		Rectangle r1 = new Rectangle(new Point(0,2), new Point(1,2), new Point(0,0), new Point(1,0));
		Rectangle r2 = new Rectangle(new Point(0,2), new Point(1,2), new Point(0,0), new Point(1,0));
		Rectangle r3 = new Rectangle(new Point(0,3), new Point(3,3), new Point(0,0), new Point(0,0));
		assertTrue(r1.equals(r2));
		assertFalse(r1.equals(null));
		assertFalse(r1.equals(r3));
	}

	@Test
	void testHashCode() {
		Rectangle r1 = new Rectangle(new Point(0,2), new Point(1,2), new Point(0,0), new Point(1,0));
		Rectangle r2 = new Rectangle(new Point(0,2), new Point(1,2), new Point(0,0), new Point(1,0));
		assertEquals(r1.hashCode(),r2.hashCode());
	}

	

}