package modules;

public class Shows {

	private int showId;	
	private Movies movie;
	private Theatres theatre;
	private String timmings;
	private int prize;
	private int availableTickets;

	


	public Shows() {
		super();
	}



	public Shows(int showId, Movies movie, Theatres theatre, String timmings, int prize, int availableTickets) {
		super();
		this.showId = showId;
		this.movie = movie;
		this.theatre = theatre;
		this.timmings = timmings;
		this.prize = prize;
		this.availableTickets = availableTickets;
	}



	public int getShowId() {
		return showId;
	}



	public void setShowId(int showId) {
		this.showId = showId;
	}



	public Movies getMovie() {
		return movie;
	}



	public void setMovie(Movies movie) {
		this.movie = movie;
	}



	public Theatres getTheatre() {
		return theatre;
	}



	public void setTheatre(Theatres theatre) {
		this.theatre = theatre;
	}



	public String getTimmings() {
		return timmings;
	}



	public void setTimmings(String timmings) {
		this.timmings = timmings;
	}



	public int getPrize() {
		return prize;
	}



	public void setPrize(int prize) {
		this.prize = prize;
	}



	public int getAvailableTickets() {
		return availableTickets;
	}



	public void setAvailableTickets(int availableTickets) {
		this.availableTickets = availableTickets;
	}



	@Override
	public String toString() {
		return "Shows [showId=" + showId + ", movie=" + movie + ", theatre=" + theatre + ", timmings=" + timmings
				+ ", prize=" + prize + ", availableTickets=" + availableTickets + "]";
	}




	
}
