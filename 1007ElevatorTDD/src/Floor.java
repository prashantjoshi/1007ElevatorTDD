
public class Floor {
	int number;
	FloorDoor floorDoor;
	Elevator elevator;
	FloorPanel fPanel;
	
	public Floor(int number) {
		this.number = number;
		floorDoor = new FloorDoor();
		fPanel = new FloorPanel(this);
		
	}

	public void setElevator(Elevator elevator) {
		this.elevator = elevator;
	}

	public int getNumber() {
		return number;
	}
	
	
	

}
