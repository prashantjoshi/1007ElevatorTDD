
public class ElevatorDoor {

	boolean doorState;		//whether door is open or closed
	String status;
	
	boolean openable; 		//whether door is openable or not
	
	
	//String status="closed";
	
	public ElevatorDoor(String status) {
		this.doorState = false;
		this.openable = true;
		this.status = "Closed";
		
	}
	
	
	public boolean isDoorState() {
		return doorState;
	}

	public void setDoorState(boolean doorState) {
		this.doorState = doorState;
	}

	
	public boolean isOpenable() {
		return openable;		//true for open
	}

	public void setOpenable(boolean openable) {
		this.openable = openable;
	}
	
	
	boolean eDoorOpen() throws OpenElevatorDoorException{
		if(isOpenable() && doorState==false){
		System.out.println("code for opening Elevator door");	
		setDoorState(true);
		setOpenable(false);
		return true;
		}
		else {
			throw new OpenElevatorDoorException();
		}
		
	}
	
	boolean eDoorClose() throws OpenElevatorDoorException{
		if(!isOpenable() && doorState==true){
		System.out.println("code for closing Elevator door");
		setDoorState(false);
		setOpenable(true);
		return true;
		}
		else {
			throw new OpenElevatorDoorException();
		}
		
	}
	
}