
public class FloorPanel {
	Floor floor;
	FloorPanelButton up;
	FloorPanelButton down;
	
	
	public FloorPanel(Floor floor) {
		this.floor = floor;
		up = new FloorPanelButton("UP");
		down = new FloorPanelButton("DOWN");
	}
	

}
