package streamapi.top5trendingmovies;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Movie {
    String name;
    double rating;
    int releaseYear;

    Movie(String name, double rating, int releaseYear) {
        this.name= name;
        this.rating= rating;
        this.releaseYear= releaseYear;
    }

    public double getRating() {
        return rating;
    }
    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return name + " -Rating: " + rating + " -Year: " + releaseYear;
    }
}


public class Main {
	public static void main(String[] args) {
		List<Movie> movieList= new ArrayList<>(java.util.List.of(
				new Movie("Movie 1", 8.5, 2021),
				new Movie("Movie 2", 9.5, 2020),
				new Movie("Movie 3", 7.5, 2019),
				new Movie("Movie 4", 6.5, 2018),
				new Movie("Movie 5", 5.5, 2017),
				new Movie("Movie 6", 8.1, 2016),
				new Movie("Movie 7", 7.9, 2015)
				));
		
		movieList.stream()
		.filter(m->m.getRating()>=7)
		.sorted(
				Comparator.comparing(Movie::getRating)
				.thenComparing(Movie::getReleaseYear,Comparator.reverseOrder())
				)
		.limit(5).forEach(System.out::println);
		
	}
}
