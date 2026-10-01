package mtms.main;

import java.util.ArrayList;

import java.util.Scanner;

import services.Booking_services;
import services.MovieServices;
import services.UserServices;
import modules.Admin;
import modules.Customer;
import modules.Movies;
import modules.Shows;
import modules.Theatres;

public class Movie_ticket_booking_main {
	
	static Scanner sc = new Scanner(System.in);
	static UserServices us = new UserServices();
	static MovieServices ms = new MovieServices();
	static Booking_services bs = new Booking_services(); 
	static ArrayList<Theatres> theatres = new ArrayList<>();
	static ArrayList<Shows> show = new ArrayList<>();

	public static void main(String[] args) {
		int choice;
		do {
		System.out.println("welcome to CHSS_world");
		System.out.println("1.admin_login");
		System.out.println("2.customer_Registration");
		System.out.println("3.customer_login");
		System.out.println("4.exist");
		System.out.println("Select your preferred option");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1: admin_login();
		break;
		
		case 2: customer_Registration();
		break;
		
		case 3: customer_login();
		break;
		
		case 4: exist();
		break;
		
		default: System.out.println("Invalid");
		break;
		}
		}
		while(choice != 4);

	}

	private static void exist() {
		
		
	}

	private static void customer_login() {
		sc.nextLine();
		
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		
		System.out.println("Enter password: ");
		String password = sc.nextLine();
		
		Customer customer = us.customerLogin(email, password);
		if ( customer != null) {
			System.out.println("Customer Login Successful");
			
			customerMenu(customer); 
		}else {
			System.out.println("Invalid Credentials");
		}

		
	}

	private static void customerMenu(Customer customer) {
		int choice;
		do {
			System.out.println("\nCustomerMenu: ");
			System.out.println("1. View Movies: ");
			System.out.println("2. Book Tickets: ");
			System.out.println("3. View All Bookings: ");
			System.out.println("4. Logout: ");
			
			System.out.println("Enter ur choice");
			choice = sc.nextInt();
			
			switch(choice){
			case 1: ms.displayMovies();
			break;
			
			case 2: bookTicket(customer);
			break;
			
			case 3: bs.viewAllBookings();
			break;
			
			case 4: System.out.println("Customer Logged out");
			break;
			
			
			}
			
		}while(choice != 4);
		
	}

	private static void bookTicket(Customer customer) {
ms.displayMovies();
		
		System.out.println("\nEnter MovieId: ");
		int movieid = sc.nextInt();
		
		Movies movie =  ms.searchByMovieId(movieid);
		
		if(movie == null) {
			System.out.println("Movie not found");
			return;
		}
		
		Theatres theatre = new Theatres(3104, "INOX", "Vijayawada");
		
		Shows show = new Shows(1,movie,theatre,"4:30pm",204,470);
		
		System.out.println("Enter the number of Tickets: ");
		int no_of_Tickets = sc.nextInt();
		int bill = no_of_Tickets*show.getPrize();
		
		bs.bookTickets(movie, theatre, show, no_of_Tickets,bill);
		
	}

	private static void customer_Registration() {
		System.out.println("enter to Customer_registration");
		System.out.println("enter the user id");
		int userid = sc.nextInt();
		System.out.println("\nenter the user name");
		String username = sc.next();
		System.out.println("enter your email id");
		String emailid = sc.next();
		System.out.println("\nEnter a password: ");
		String password = sc.next();
		System.out.println("enter your mobile number");
		long mobilenumber = sc.nextLong();
		
		Customer customer = new Customer(userid,username,emailid,password,mobilenumber);
		us.addCustomer(customer);
		
	}

	private static void admin_login() {
		System.out.println("Enter Admin email: ");
		String email = sc.next();
		System.out.println("enter admin password: ");
		String password = sc.next();
		
		Admin admin = us.admin(email, password);
		if(admin != null) {
			System.out.println("welcome admin");
			adminmenu();
		}else {
			System.out.println("wrong credentials");
		}
		
	}

	private static void adminmenu() {
		int choice;
		do {
			System.out.println("1.add a movie");
			System.out.println("2.displayMovies");
			System.out.println("3.delete a movie");
			System.out.println("4.view all Bookings");
			System.out.println("5.logout");
			
		System.out.println("enter a choice");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1: addMovies();
		break;
		
		case 2: ms.displayMovies();
		break;
		
		case 3:System.out.println("enter the movie to be deleted");
		        String mname = sc.next();
		        ms.deleteMovie(mname);
		break;
		
		case 4: bs.viewAllBookings();
		break;
		
		case 5: System.out.println("admin logged out");
		break;
		
		default: System.out.println("invalid");
		break;
		}
		}while(choice!=4);
		
	}

	private static void addMovies() {                                       
		System.out.println("Adding a movie ");
		
		System.out.println("enter a movie id: ");
		int movieId=sc.nextInt();
		System.out.println("\nenter a movie name: ");
		String moviename = sc.next();
		System.out.println("enter a language: ");
		String language = sc.next();
		System.out.println("enter a duration: ");
		String duration = sc.next();
		System.out.println("enter a rating: ");
		double ratings = sc.nextDouble();
		System.out.println("enter a genre: ");
		String genre = sc.next();
		
		Movies movie = new Movies(movieId,moviename,language,duration,ratings,genre);
		ms.addMovies(movie);
		System.out.println(moviename+ " has been added successfully ");
	}

}
