package modules;

public class Bookings {
	private int bookingId;
	private Movies movie;
	private Theatres theatre;
	private Shows show;
	private int noofTickets;
	private float total_amount;
	
	public Bookings() {
		// TODO Auto-generated constructor stub
	}

	public Bookings(int bookingId, Movies movie, Theatres theatre, Shows show, int noofTickets, float total_amount) {
		super();
		this.bookingId = bookingId;
		this.movie = movie;
		this.theatre = theatre;
		this.show = show;
		this.noofTickets = noofTickets;
		this.total_amount = total_amount;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
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

	public Shows getShow() {
		return show;
	}

	public void setShow(Shows show) {
		this.show = show;
	}

	public int getNoofTickets() {
		return noofTickets;
	}

	public void setNoofTickets(int noofTickets) {
		this.noofTickets = noofTickets;
	}

	public float getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(float total_amount) {
		this.total_amount = total_amount;
	}

	@Override
	public String toString() {
		return "Bookings [bookingId=" + bookingId + ", movie=" + movie + ", theatre=" + theatre + ", show=" + show
				+ ", noofTickets=" + noofTickets + ", total_amount=" + total_amount + "]";
	}
	
	

}
