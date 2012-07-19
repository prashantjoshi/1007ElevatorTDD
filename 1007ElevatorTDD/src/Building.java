import java.util.ArrayList;


public class Building {
	ArrayList<Floor> floors;
	Elevator elevator;
	
	public Building(int numberOfFloors) {
		int floor;
		floors = new ArrayList<Floor>();
		for(floor = 0; floor < numberOfFloors; floor++) {
			floors.add(new Floor(numberOfFloors));
		}
		
	}
	

}
