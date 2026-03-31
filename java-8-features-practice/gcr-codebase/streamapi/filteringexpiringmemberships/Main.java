package streamapi.filteringexpiringmemberships;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Member {
    private String name;
    private LocalDate expiryDate;

    public Member(String name, LocalDate expiryDate) {
        this.name= name;
        this.expiryDate= expiryDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return name + " -Expires on: " + expiryDate;
    }
}

public class Main {
	public static void main(String[] args) {
		List<Member> members= new ArrayList<>(
				Arrays.asList(
						new Member("Pushpak", LocalDate.now().plusDays(10)),
					    new Member("Prakash", LocalDate.now().plusDays(40)),
					    new Member("Anubhav", LocalDate.now().plusDays(25)),
					    new Member("Sahil", LocalDate.now().plusDays(5)),
					    new Member("Divanshu", LocalDate.now().minusDays(2))
						)
				);
		
		members.stream()
			.filter(member->
			!member.getExpiryDate().isBefore(LocalDate.now()) &&
			member.getExpiryDate().isBefore(LocalDate.now().plusDays(30)))
			.forEach(System.out::println);
	}
}
