package regexandjunit.junit.testinglistoperations;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ListManagerTest {
	
	ListManager lm= new ListManager();
	List<Integer> list= new LinkedList<>();
	
	@Test
	void checkAdd() {
		lm.addElement(list, 3);
		assertTrue(list.lastIndexOf(3)==(list.size()-1));
	}
	
	@Test
	void checkRemove() {
		lm.removeElement(list, 3);
		assertTrue(list.indexOf(3)==-1);
	}
	
	@Test
	void checkSize() {
		assertTrue(lm.getSize(list)==list.size());
	}
}
