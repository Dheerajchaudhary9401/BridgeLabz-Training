package CinemaTime;
import java.util.*;

public class CinemaService {

    private List<Movie> movies = new ArrayList<>();

    // Add movie
    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }
        movies.add(new Movie(title, time));
    }

    // Search movie using String.contains()
    public void searchMovie(String keyword) {
        boolean found = false;
        try {
            for (Movie movie : movies) {
                if (movie.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println("Found: " + movie);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No movie found with keyword: " + keyword);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Search error occurred.");
        }
    }

    // Display all movies
    public void displayAllMovies() {
        try {
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Display error.");
        }
    }

    // Convert list to array for report
    public void generateReport() {
        Movie[] movieArray = movies.toArray(new Movie[0]);

        System.out.println("\n--- Printable Movie Report ---");
        for (Movie movie : movieArray) {
            System.out.println(movie.getTitle() + " at " + movie.getTime());
        }
    }

    // Time validation (HH:mm)
    private boolean isValidTime(String time) {
        try {
            String[] parts = time.split(":");
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            return hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59;
        } catch (Exception e) {
            return false;
        }
    }
}
