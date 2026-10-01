package modules;

public class Theatres {

	private int theatreId;
	private String theatrename;
	private String Location;
	
	
	
	public Theatres() {
		super();
	}



	public Theatres(int theatreId, String theatrename, String location) {
		super();
		this.theatreId = theatreId;
		this.theatrename = theatrename;
		Location = location;
	}



	public int getTheatreId() {
		return theatreId;
	}



	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}



	public String getTheatrename() {
		return theatrename;
	}



	public void setTheatrename(String theatrename) {
		this.theatrename = theatrename;
	}



	public String getLocation() {
		return Location;
	}



	public void setLocation(String location) {
		Location = location;
	}



	@Override
	public String toString() {
		return "Theatres [theatreId=" + theatreId + ", theatrename=" + theatrename + ", Location=" + Location + "]";
	}
	
	
	
}
