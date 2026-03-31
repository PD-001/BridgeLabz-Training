package regexandjunit.junit.testingbeforeandaftereach;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DataBaseConnectionTest {
	
	DataBaseConnection db;
	
	@BeforeEach
	void connectioncheck() {
		db= new DataBaseConnection();
		db.connect();
	}
	
	@Test
	void Test() {
		assertNotNull(db);
	}
	
	@AfterEach
	void disconnectioncheck() {
		db.disconnect();
		db= null;
	}
	
}
