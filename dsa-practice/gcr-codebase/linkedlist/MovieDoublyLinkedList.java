class MovieNode {
	String title;
	String director;
	int year;
	double rating;
	MovieNode next;
	MovieNode prev;

	//constructor
	MovieNode(String title,String director,int year,double rating) {
		this.title= title;
		this.director= director;
		this.year= year;
		this.rating= rating;
		this.next= null;
		this.prev= null;
	}
}

public class MovieDoublyLinkedList {

	private MovieNode head;
	private MovieNode tail;

	//method to add movie at beginning
	public void addAtBeginning(String title,String director,int year,double rating) {
		MovieNode newNode= new MovieNode(title,director,year,rating);

		if (head==null) {
			head= newNode;
			tail= newNode;
		}
		else {
			newNode.next= head;
			head.prev= newNode;
			head= newNode;
		}
		System.out.println("Movie added at beginning");
	}

	//method to add movie at end
	public void addAtEnd(String title,String director,int year,double rating) {
		MovieNode newNode= new MovieNode(title,director,year,rating);

		if (head==null) {
			head= newNode;
			tail= newNode;
			return;
		}

		tail.next= newNode;
		newNode.prev= tail;
		tail= newNode;
		System.out.println("Movie added at end");
	}

	//method to add movie at specific position
	public void addAtPosition(int position,String title,String director,int year,double rating) {
		if (position==1) {
			addAtBeginning(title,director,year,rating);
			return;
		}

		MovieNode newNode= new MovieNode(title,director,year,rating);
		MovieNode temp= head;

		for (int i=1;i<position-1 && temp!=null;i++) {
			temp= temp.next;
		}

		if (temp==null || temp.next==null) {
			addAtEnd(title,director,year,rating);
			return;
		}

		newNode.next= temp.next;
		newNode.prev= temp;
		temp.next.prev= newNode;
		temp.next= newNode;

		System.out.println("Movie added at position "+position);
	}

	//method to remove movie by title
	public void removeByTitle(String title) {
		if (head==null) {
			System.out.println("Movie list is empty");
			return;
		}

		MovieNode temp= head;

		while (temp!=null && !temp.title.equalsIgnoreCase(title)) {
			temp= temp.next;
		}

		if (temp==null) {
			System.out.println("Movie not found");
			return;
		}

		if (temp==head) {
			head= head.next;
			if (head!=null) {
				head.prev= null;
			}
			else {
				tail= null;
			}
		}
		else if (temp==tail) {
			tail= tail.prev;
			tail.next= null;
		}
		else {
			temp.prev.next= temp.next;
			temp.next.prev= temp.prev;
		}

		System.out.println("Movie removed successfully");
	}

	//method to search movie by director
	public void searchByDirector(String director) {
		MovieNode temp= head;
		boolean found= false;

		while (temp!=null) {
			if (temp.director.equalsIgnoreCase(director)) {
				displaySingleMovie(temp);
				found= true;
			}
			temp= temp.next;
		}

		if (!found) {
			System.out.println("No movies found for given director");
		}
	}

	//method to search movie by rating
	public void searchByRating(double rating) {
		MovieNode temp= head;
		boolean found= false;

		while (temp!=null) {
			if (temp.rating==rating) {
				displaySingleMovie(temp);
				found= true;
			}
			temp= temp.next;
		}

		if (!found) {
			System.out.println("No movies found with given rating");
		}
	}

	//method to update movie rating by title
	public void updateRating(String title,double newRating) {
		MovieNode temp= head;

		while (temp!=null) {
			if (temp.title.equalsIgnoreCase(title)) {
				temp.rating= newRating;
				System.out.println("Movie rating updated");
				return;
			}
			temp= temp.next;
		}
		System.out.println("Movie not found");
	}

	//method to display movies forward
	public void displayForward() {
		if (head==null) {
			System.out.println("No movies available");
			return;
		}

		MovieNode temp= head;
		while (temp!=null) {
			displaySingleMovie(temp);
			temp= temp.next;
		}
	}

	//method to display movies in reverse
	public void displayReverse() {
		if (tail==null) {
			System.out.println("No movies available");
			return;
		}

		MovieNode temp= tail;
		while (temp!=null) {
			displaySingleMovie(temp);
			temp= temp.prev;
		}
	}

	//method to display single movie
	private void displaySingleMovie(MovieNode movie) {
		System.out.println("Title: "+movie.title);
		System.out.println("Director: "+movie.director);
		System.out.println("Year: "+movie.year);
		System.out.println("Rating: "+movie.rating);
		System.out.println();
	}

	public static void main(String[] args) {

		MovieDoublyLinkedList list= new MovieDoublyLinkedList();

		list.addAtBeginning("Inception","Nolan",2010,9.0);
		list.addAtEnd("Interstellar","Nolan",2014,8.8);
		list.addAtPosition(2,"Avatar","Cameron",2009,7.8);

		System.out.println();
		list.displayForward();

		System.out.println();
		list.searchByDirector("Nolan");

		System.out.println();
		list.updateRating("Avatar",8.2);

		System.out.println();
		list.displayReverse();

		System.out.println();
		list.removeByTitle("Inception");

		System.out.println();
		list.displayForward();
	}
}
