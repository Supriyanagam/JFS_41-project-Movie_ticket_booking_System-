package modules;

public class Movies {
	private int movieId;
	private String moviename;
	private String language;
	private String duration;
	private double ratings;
	private String genre;
	
	public Movies() {
		// TODO Auto-generated constructor stub
	}

	public Movies(int movieId, String moviename, String language, String duration, double ratings, String genre) {
		super();
		this.movieId = movieId;
		this.moviename = moviename;
		this.language = language;
		this.duration = duration;
		this.ratings = ratings;
		this.genre = genre;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", moviename=" + moviename + ", language=" + language + ", duration="
				+ duration + ", ratings=" + ratings + ", genre=" + genre + "]";
	}
	

}
