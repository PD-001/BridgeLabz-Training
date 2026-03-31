package collectors.librarybookstatistics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book {
	String genre;
	int pages;

	public Book(String genre, int pages) {
		this.genre= genre;
		this.pages= pages;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre= genre;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages= pages;
	}
}

public class Main {
	public static void main(String[] args) {

		List<Book> books= new ArrayList<>(
				Arrays.asList(
						new Book("Fiction", 300),
						new Book("Fiction", 450),
						new Book("Science", 500),
						new Book("Science", 350),
						new Book("History", 400)
				)
		);

		Map<String, IntSummaryStatistics> statsByGenre=
				books.stream()
					.collect(Collectors.groupingBy(
							Book::getGenre,
							Collectors.summarizingInt(Book::getPages)
					));

		statsByGenre.forEach((genre, stats) -> {
			System.out.println("Genre: " + genre);
			System.out.println("Total pages: " + stats.getSum());
			System.out.println("Avg pages: " + stats.getAverage());
			System.out.println("Max pages: " + stats.getMax());
			System.out.println();
		});
	}
}
