
public class ElevatorControlPanelButton {
	
	boolean isPressed;
	int floorNo;
	
	public ElevatorControlPanelButton(int floorNo) {
		this.floorNo = floorNo;
		this.isPressed = false;
		
	}

	public boolean isPressed() {
		return isPressed;
	}

	public void setPressed(boolean isPressed) {
		this.isPressed = isPressed;
	}

	public int getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}

}
