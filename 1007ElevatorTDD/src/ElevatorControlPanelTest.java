import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ElevatorControlPanelTest {

	ElevatorControlPanel ecPanel;
	Floor floor;
	@Before
	public void setUp() throws Exception {
		ecPanel = new ElevatorControlPanel(10);
		floor = new Floor(10);
	}

	@Test
	public void testElevatorControlPanel() {
		assertNotNull(ecPanel);
		//fail("Not yet implemented");
	}
	@Test
	public void testForEqualityOfFloorsAndConTrolPanelButtons() {
		assertEquals(floor.getNumber(),ecPanel.floorButtons.size());
	}

}
