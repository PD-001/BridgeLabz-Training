package regexandjunit.junit.testingfilehandlingmethods;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class FileProcessorTest {
	FileProcessor fp= new FileProcessor();
	
	@Test
	void writecheck() throws IOException {
		fp.writeToFile("destination.txt", "Yollo");
		File file= new File("destination.txt");
		
		assertTrue(file.exists());
	}
	
	@Test
	void readcheck() throws IOException {
		String result=fp.readFromFile("destination.txt");
		
		assertEquals("Yollo"+"\n", result);
	}
	
	@Test
	void exceptionThrowCheck(){
		assertThrows(IOException.class, ()->fp.readFromFile(null));
	}
	
}
