package services;

import java.util.ArrayList;


import modules.Movies;



public class MovieServices {
	private ArrayList<Movies>movieList=new ArrayList<>();
		
	//Adding a Movie
	public  void addMovies(Movies movie) {
		movieList.add(movie);
		System.out.println("Movie Added Successfully");
	}
	
	//To Display List Of All The  Customers
	public void displayMovies() {
		if(movieList.isEmpty()) {
			System.out.println("No Customers Available");
			return;
		}else{
			for(Movies movie:movieList) {
				System.out.println(movie);
			}
		}
	}
	
    //To Search a MovieID
    public Movies searchByMovieId(int id) {
    	for(Movies movie:movieList) {
			if(movie.getMovieId()==id) {
				System.out.println("Movie Found");
				return movie;
				
			}
		}
    	return null;
    }
    
    //To Search a Movie Name
    public Movies searchByMovieId(String mname) {
    	for(Movies movie:movieList) {
			if(movie.getMoviename().equalsIgnoreCase(mname)) {
				System.out.println("Movie Found");
				return movie;	
			}
		}
    	return null;
    }
    
    //To Delete  a customer
    public void deleteMovie(String mname) {
    	Movies movie=searchByMovieId(mname);
    if(movie!=null) {
    	movieList.remove(movie);
    	System.out.println("Customer Deleted Successfully");
    }else{
    	System.out.println("Customer Not Found");
    }	
    }
}