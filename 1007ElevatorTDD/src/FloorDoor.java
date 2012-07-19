
public class FloorDoor {
	
	private FloorDoorState state;
	boolean doorState;		//whether door is open or closed
	boolean openable;		//whether door is openable or not
	
	

	public void setState(FloorDoorState state) {
		this.state = state;
	}
	
	public void open() {
		state.open();
	}
	public void close() {
		state.close();
	}

}


