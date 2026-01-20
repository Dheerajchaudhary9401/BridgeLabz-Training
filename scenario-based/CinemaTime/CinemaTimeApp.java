package CinemaTime;

public class CinemaTimeApp {
    public static void main(String[] args) {

        CinemaService cinema = new CinemaService();

        try {
            cinema.addMovie("Inception", "18:30");
            cinema.addMovie("Interstellar", "21:15");
            cinema.addMovie("Avatar", "25:99"); // Invalid time
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }

        cinema.displayAllMovies();
        cinema.searchMovie("Inter");
        cinema.generateReport();
    }
}

