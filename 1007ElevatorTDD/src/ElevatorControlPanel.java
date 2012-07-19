import java.util.ArrayList;


public class ElevatorControlPanel {
	LED direction;
	
	ArrayList<ElevatorControlPanelButton> floorButtons;
	
	public ElevatorControlPanel(int noOfFloors) {
		int floor;
		floorButtons = new ArrayList<ElevatorControlPanelButton>();
		for(floor = 0; floor < noOfFloors; floor++) {
			floorButtons.add(new ElevatorControlPanelButton(floor));
		}
		direction = new LED("Stationery");
	}
	
	
	

}
