import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class VehicleTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		TestVehicle t = new TestVehicle();
		int carSize = 1;
		int truckSize = 1;
		int hogSize = 1;
		int perSize = 2;
		assertEquals("The car's hash map size isn't as expected", t.getCarMap().size(), carSize);
		assertEquals("The truck's hash map size isn't as expected", t.getTruckMap().size(), truckSize);
		assertEquals("The hog's hash map size isn't as expected", t.getHogMap().size(), hogSize);
		assertEquals("The persoon's hash map size isn't as expected", t.getPerMap().size(), perSize);
	}

}
